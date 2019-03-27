package team12.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao jogo da velha");
        JogoDaVelha jogo = new JogoDaVelha();
        imprimeTabuleiro(jogo.getTabuleiro());
        Scanner entrada = new Scanner(System.in);
        int linha;
        int coluna;
        int jogada=0;
        char jogador = 'X';

        while(jogada<9){
            System.out.println("Entre com a linha da jogada");
            linha  = entrada.nextInt();
            System.out.println("Entre com a coluna da jogada");
            coluna = entrada.nextInt();

            if(jogo.setJogada(jogador, linha, coluna)){
                imprimeTabuleiro(jogo.getTabuleiro());
                jogada++;
                if(jogo.verificaVencedor()){
                    System.out.println("Parabens ao jogador: "+jogador);
                    break;
                }
                jogador = mudaSimbolo(jogador);
            } else {
                System.out.println("Entre com uma jogada valida");
            }


        }


    }

    public static char mudaSimbolo(char simbolo){
        if(simbolo=='X'){
            return 'O';
        }
        return 'X';
    }

    public static void imprimeTabuleiro(char[][] tabuleiro){
        for(int i = 0; i<tabuleiro.length; i++){
            for(int j = 0; j<tabuleiro[0].length; j++){
                if(tabuleiro[i][j]==' '){
                    if(i<2){
                        System.out.print('_');
                    } else {
                        System.out.print(' ');
                    }

                } else {
                    System.out.print(tabuleiro[i][j]);
                }
                if(j<2){
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }
}
