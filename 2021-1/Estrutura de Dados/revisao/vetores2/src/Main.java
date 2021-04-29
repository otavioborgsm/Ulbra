import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*Elabore uma classe que receba 5 notas de alunos por meio, armazene essas notas em um array de cinco elementos,
     apresente em tela as cinco notas em ordem decrescente (da maior para a menor) e a média aritmética das notas.
     */
    public static void main(String[] args) {

        double notas[] = new double[5];
        double notasTotal = 0;
        double media;
        int numeroAluno = 0;

        Scanner tc = new Scanner(System.in);


        for(int i=0; i<= 4; i++){

            numeroAluno=i+1;
            System.out.println("Informe a nota do aluno "+numeroAluno+": ");
            notas[i]+=tc.nextDouble();

            notasTotal+=notas[i];

        }

        media=notasTotal/numeroAluno;

        //Ordenando as notas
        for(int i=0;i<notas.length;i++) {

            notas[i]=-notas[i];
        }

        Arrays.sort(notas);

        for(int i=0;i<notas.length;i++) {

            notas[i]=-notas[i];
        }

        System.out.print("\nNotas em ordem crescente: ");

        for (int i = 0; i <= 4; i++) {

            if (i<4) {

                System.out.print(notas[i]+", ");

            }else{

                System.out.print(notas[i]);

            }

        }

        System.out.println("\nMedia aritmética das notas: "+media);

    }

}