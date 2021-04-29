import java.util.Scanner;

public class Main {
    /*
    Solicitar a idade de um número indefinido de pessoas e imprimir a média de idade lidas.
    O programa se encerra quando a média de idade for superior a 20 anos ou que tenha lido 10 pessoas.
    */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        float media = 0;
        int total=0;
        int pessoas=0;

        do {

            System.out.println("Informe a idade para calcular a média:");
            int idade = x.nextInt();

            total += idade;
            pessoas++;
            media = total/pessoas;

        }while (media <20 && pessoas !=10);

        System.out.println("Média superior a 20, programa encerrado!!");
        System.out.println("Número total de pessoas: "+pessoas);
        System.out.println("Média total: "+media);
    }
}
