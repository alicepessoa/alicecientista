
package br.com.unp.jogodavelha_allekcorreia;

import java.util.Scanner;
public class Jogo {
    public Jogo(){
    int jogadalinha, jogadacoluna;
    Interface tabuleiro = new Interface();
    Scanner scan = new Scanner(System.in);
        System.out.println("\tBem-vindo ao Jogo da Velha!\n\tFeito por: Állek, Alice e Lucila!");
    do
    {
        tabuleiro.mostrarTabuleiro();
        if (tabuleiro.jogadoratual == 'X'){
            System.out.println("\n\t\tJogador Atual: 1");
        }
        else
            System.out.println("\n\t\tJogador Atual: 2");
        do{
        System.out.print("Escolha uma linha (de 1 à 3): ");
        jogadalinha = (scan.nextInt() - 1);
        System.out.print("Escolha uma Coluna (de 1 à 3): ");
        jogadacoluna = (scan.nextInt() - 1);
        if ((jogadalinha >= 0) && (jogadalinha < 3)){
            if ((jogadacoluna >= 0) && (jogadacoluna < 3)){
                if (tabuleiro.tabuleiro[jogadalinha][jogadacoluna] != ' '){
                    System.out.println("Lugar já preenchido! Escolha novamente.");
                }
            }
            else
                System.out.println("Coluna inválida. Escolha novamente de 1 à 3.");
        }
        else
                System.out.println("Linha inválida. Escolha novamente de 1 à 3.");
        }while(tabuleiro.tabuleiro[jogadalinha][jogadacoluna] != ' ');
        tabuleiro.jogada(jogadalinha, jogadacoluna);
        tabuleiro.ganhou();
        if (tabuleiro.ganhou() == true){
            if (tabuleiro.jogadoratual == 'X'){
                System.out.println("\nJogador 1 Ganhou! :)");
            }
            else
                System.out.println("\nJogador 2 Ganhou! :D ");
        }
        tabuleiro.TrocarJogador();
    } while (tabuleiro.ganhou() == false);
    
    }
}
