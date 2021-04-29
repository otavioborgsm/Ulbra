import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        ArrayList<Livro> biblioteca = new ArrayList<>();
        int resposta;

        do {

            System.out.println("INFORME A OPERAÇÃO:\n1 - Adicionar livro\n2 - Remover livro\n3 - Listar livros\n4 - Buscar Livro \n5 - Encerrar");
            resposta = tc.nextInt();

            switch (resposta){

                case 1:{

                    System.out.println("Informe o nome do livro: ");
                    tc.nextLine();
                    String tit = tc.nextLine();

                    System.out.println("Informe o autor do livro: ");
                    tc.nextLine();
                    String aut  = tc.nextLine();

                    System.out.println("Informe o ISBN do livro: ");
                    int is = tc.nextInt();

                    System.out.println("Informe o número de páginas do livro: ");
                    int pag = tc.nextInt();

                    Livro livro = new Livro( tit,  aut,  is,  pag);
                    biblioteca.add(livro);

                }

                case 2:{

                }

                case 3:{

                }

                case 4:{

                }

                case 5:{
                    System.out.println("Programa encerrado!");
                }

                default:{
                    System.out.println("Código inválido!!");
                }
            }


        }while (resposta !=5);
    }
}
