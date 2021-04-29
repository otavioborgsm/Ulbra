import java.util.Scanner;

public class Main {
    /*
    Escrever um programa que receba vários números inteiros no teclado e no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).
    */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        float media = 0;
        int total = 0;
        int numeros = 0;
        int num;



        do {

            System.out.println("\nPara encerrar o programa digite 0.");
            System.out.println("Informe números inteiros: ");
            num = x.nextInt();

            if (num%3==0 && num!=0) {
                total += num;
                numeros++;
                media = total / numeros;
            }
        }while (num !=0);

        System.out.println("Número 0 informado, programa encerrado!!");
        System.out.println("Média total dos números múltiplos de 3: "+media);
    }
}
