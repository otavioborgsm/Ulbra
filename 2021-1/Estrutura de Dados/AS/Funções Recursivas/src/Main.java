import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FuncoesRecursivas funcoesRecursivas = new FuncoesRecursivas();

        Scanner tc = new Scanner(System.in);

        System.out.println("Informe o tamanho de sua lista: ");
        int tamanho = tc.nextInt();

        if(tamanho<=0){
            System.out.println("Tamanho inválido!!");
        }else{

            int[] array = new int[tamanho];


            for (int i = 0; i < tamanho; i++) {

                System.out.println("Informe o item na posição " + i + ": ");

                array[i] = tc.nextInt();
            }

            for (int i = 0; i < tamanho; i++) {
                System.out.println(array[i]);
            }

            System.out.println("\nSoma dos elementos da lista: "+funcoesRecursivas.somaArray(array, tamanho-1));
            System.out.println("Maior elemento da lista: "+funcoesRecursivas.validaMaior(array, 0, tamanho-1));
        }

    }
}
