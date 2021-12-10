package com.letscode.example;

public class JogoDaVelha {

    public static void main(String[] args) throws InterruptedException {

        /**
         * Notes:
         * _ | _ | _
         * _ | _ | _
         * |   |
         * Helpful indices
         * [0][0] , [0][2] , [0][4]
         * [1][0] , [1][2] , [1][4]
         * [2][0] , [2][2] , [2][4]
         **/

        /*Essa é uma forma simples de se fazer o tabuleiro.
          Você pode testar outras formas de fazer ou
          até mesmo utilizar estruturas de repetição.*/
        char[][] tabuleiro = {
                {'_', '|', '_', '|', '_'},
                {'_', '|', '_', '|', '_'},
                {'_', '|', '_', '|', '_'}
        };

        System.out.println("Inicio do jogo");
        printTabuleiro(tabuleiro);

        /*Esse código comentado foi um teste que perguntaram
            como limpar o console enquanto imprime o tabuleiro,
            não é necessário para fazer o desafio do jogo da velha*/
        //Thread.sleep(1000);
        //clearConsole();

        System.out.println("Primeira Jogada");
        /* Chamada do método, passando a posição da jogada e o jogador
         * neste caso está marcando um "X"
         * na segunda casa da primeira linha */
        atualizarTabuleiro(2, 1, tabuleiro);
        //Thread.sleep(1000);
        //clearConsole();

        System.out.println("Segunda Jogada");
        /* Chamada do método, passando a posição da jogada e o jogador
         * neste caso está marcando um "O"
         * na segunda casa da segunda linha */
        atualizarTabuleiro(5, 2, tabuleiro);

    }

    public static void printTabuleiro(char[][] tabuleiro) {

        for (char[] row : tabuleiro) {
            for (char collumn : row) {
                System.out.print(collumn);
            }
            System.out.println();
        }
    }

    /* Método que contém a lógica para marcar o tabuleiro
        Jogador 1 = 'x';
        Jogador 2 = 'o';
     */
    public static void atualizarTabuleiro(int posicao, int jogador, char[][] tabuleiro) {

        char character;

        if (jogador == 1) {
            character = 'X';
        } else {
            character = 'O';
        }

        switch (posicao) {
            case 1:
                tabuleiro[0][0] = character;
                printTabuleiro(tabuleiro);
                break;
            case 2:
                tabuleiro[0][2] = character;
                printTabuleiro(tabuleiro);
                break;
            case 3:
                tabuleiro[0][4] = character;
                printTabuleiro(tabuleiro);
                break;
            case 4:
                tabuleiro[1][0] = character;
                printTabuleiro(tabuleiro);
                break;
            case 5:
                tabuleiro[1][2] = character;
                printTabuleiro(tabuleiro);
                break;
            case 6:
                tabuleiro[1][4] = character;
                printTabuleiro(tabuleiro);
                break;
            case 7:
                tabuleiro[2][0] = character;
                printTabuleiro(tabuleiro);
                break;
            case 8:
                tabuleiro[2][2] = character;
                printTabuleiro(tabuleiro);
                break;
            case 9:
                tabuleiro[2][4] = character;
                printTabuleiro(tabuleiro);
                break;

            default:
                break;
        }
    }

    /*Método para limpar console, não é necessário para o jogo da velha.
     * Está aqui a nível de conhecimento*/
    /*public static void clearConsole() {

        try {
            String operatingSystem = System.getProperty("os.name"); //Check the current operating system

            if (operatingSystem.contains("Windows")) {
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls", "clear");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();

                startProcess.waitFor();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }*/

}
