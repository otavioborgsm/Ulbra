import java.util.Scanner;

public class Main {
    /*
    Escrever um programa que leia, valores inteiros, até ser lido o valor-99.
    Quando isso acontecer o programa deverá escrever a soma e a média dos valores lidos.
    */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        float media;
        int total=0;
        int numeros=0;
        int num;

        do {

            System.out.println("Informe números inteiros: ");
            num = x.nextInt();

            total += num;
            numeros++;
            media = total/numeros;

        }while (num !=99);

        System.out.println("Número 99 informado, programa encerrado!!");
        System.out.println("Soma dos valores lidos: "+total);
        System.out.println("Média total dos números: "+media);
    }
}