import java.util.Random;

public class Matriz {

    private static int tamanho = 10;
    private int[][] matriz = new int[tamanho][tamanho];
    private int[][] matrizTeste = new int[9][9];
    int padrao = 0;
    int padraoTeste= 0;



    public void preencheMatriz(){//Método que cria matriz com números binários aleatórios

        for (int c = 0; c < tamanho; ++c) {
            for (int l = 0; l < tamanho; ++l) {
                matriz[l][c] = new Random().nextInt(2);
            }
        }

    }

    public void exibirMatriz(){//Método que exibe a Matriz

        System.out.println("Matriz ↴");

        for (int l = 0; l < tamanho; ++l) {
            for (int c = 0; c < tamanho; ++c) {
                System.out.print(matriz[c][l] + " ");
            }
            System.out.println();
        }

    }

    public void buscaPadrao(){//Método que busca o padrão desejado na Matriz

        System.out.println("Padrão buscado: \n1 1\n1 0");

        for (int l = 0; l < tamanho-1; ++l) {
            for (int c = 0; c < tamanho-1; ++c) {

                if (matriz[c][l] == 1 && matriz[c + 1][l] == 1 && matriz[c][l+1]==1 && matriz[c+1][l+1]==0){
                    padrao++;
                    System.out.print("Padrão encontrado na linha: "+(l+1)+" coluna: "+(c+1)+" || ");
                }

            }
        }

        if (padrao >0) {
            System.out.println("\nTotal de vezes encontrado: " + padrao);
        }else{
            System.out.println("\nPadrão não encontrado!");
        }

    }

    public void preencherTeste(){//Método que preenche a Matriz de testes

        matrizTeste= new int[][]{{0, 0, 0, 0, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0, 0, 1, 0, 1},
                {1, 1, 1, 0, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 1, 0, 0},
                {0, 1, 1, 0, 0, 1, 0, 0, 1},
                {0, 1, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}};

    }

    public void exibirTeste(){//Método que exibe a matriz de teste

        System.out.println("Matriz ↴");

        for (int l = 0; l < matrizTeste.length; ++l) {
            for (int c = 0; c < matrizTeste.length; ++c) {
                System.out.print(matrizTeste[c][l] + " ");
            }
            System.out.println();
        }

    }

    public void padraoTeste(){//Busca o padrao na Matriz de teste

        System.out.println("Padrão buscado: \n1 1\n1 0");

        long startTime = System.nanoTime();//Inicia o cronometro
        methodToTime();

        for (int l = 0; l <8; ++l) {
            for (int c = 0; c < 8; ++c) {

                if (matrizTeste[c][l] == 1 && matrizTeste[c + 1][l] == 1 && matrizTeste[c][l+1]==1 && matrizTeste[c+1][l+1]==0){
                    padraoTeste++;
                    System.out.println("Padrão encontrado na linha: "+(l+1)+" coluna: "+(c+1));
                }

            }
        }

        long endTime = System.nanoTime();//Encerra o cronometro
        long duration = (endTime - startTime);//Calcula o tempo

        System.out.println("Total de vezes encontrado: "+padraoTeste+"\nTempo total: "+duration+" nanoTime");
    }

    private void methodToTime() {//Método do cronometro
    }
}
