package team12.company;

public class JogoDaVelha {

    private char[][] tabuleiro;

    public JogoDaVelha(){
        tabuleiro = new char[3][3];
        for(int i = 0; i<tabuleiro.length; i++){
            for(int j = 0; j<tabuleiro[0].length; j++){
                tabuleiro[i][j] = ' ';
            }
        }
    }

    public char[][] getTabuleiro() {
        return tabuleiro;
    }

    public boolean setJogada(char jogador, int linha, int coluna) {
        if(linha>=0 && linha<=2){
            if(coluna>=0 && coluna<=2){
                if(tabuleiro[linha][coluna]==' '){
                    tabuleiro[linha][coluna] = jogador;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean verificaVencedor(){

        if(tabuleiro[0][0]!=' '){
            if(tabuleiro[0][0]==tabuleiro[0][1] && tabuleiro[0][0]==tabuleiro[0][2]){
                return true;
            }

            if(tabuleiro[0][0]==tabuleiro[1][0] && tabuleiro[0][0]==tabuleiro[2][0]){
                return true;
            }

            if(tabuleiro[0][0]==tabuleiro[1][1] && tabuleiro[0][0]==tabuleiro[2][2]){
                return true;
            }
        }

        if(tabuleiro[1][0]!=' '){
            if(tabuleiro[1][0]==tabuleiro[1][1] && tabuleiro[1][0]==tabuleiro[1][2]){
                return true;
            }
        }

        if(tabuleiro[2][0]!=' ') {
            if(tabuleiro[2][0]==tabuleiro[2][1] && tabuleiro[2][0]==tabuleiro[2][2]){
                return true;
            }

            if(tabuleiro[2][0]==tabuleiro[1][1] && tabuleiro[2][0]==tabuleiro[0][2]){
                return true;
            }
        }

        if(tabuleiro[0][1]!=' '){
            if(tabuleiro[0][1]==tabuleiro[1][1] && tabuleiro[0][1]==tabuleiro[2][1]){
                return true;
            }
        }

        if(tabuleiro[0][2]!=' '){
            if(tabuleiro[0][2]==tabuleiro[1][2] && tabuleiro[0][2]==tabuleiro[2][2]){
                return true;
            }
        }

        return false;
    }
}
