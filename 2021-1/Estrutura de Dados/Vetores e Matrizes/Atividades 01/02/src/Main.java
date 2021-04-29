import java.util.Scanner;

public class Main {
    /*Leia um conjunto de notas, cuja quantidade seja determinada pelo usuário.
     Calcule a média de todas elas.
      Exiba o conjunto das notas maiores do que a média calculada.
       Em seguida, de forma agrupada, exiba o outro conjunto de notas (menores do que a média).
       Utilize vetores

     */
    public static void main(String[] args) {
        int totalAlunos;
        double totalNotas = 0;
        double media;

        Scanner tc = new Scanner(System.in);
        System.out.println("Informe a quantidade de alunos: ");
        totalAlunos=tc.nextInt();

        double notas[] = new double[totalAlunos];

        for (int i = 0; i <notas.length ; i++) {

            System.out.println("Informe a nota do aluno "+(i+1)+": ");
            notas[i]=tc.nextDouble();

            totalNotas+=notas[i];

        }
        media=totalNotas/totalAlunos;

        System.out.println("Lista de notas superiores a média: ");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]>=media){
                System.out.println(notas[i]);
            }
        }

        System.out.println("Lista de notas inferiores a média: ");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]<media){
                System.out.println(notas[i]);
            }
        }
    }
}
