import java.util.Scanner;

public class Main {
    /*Leia um conjunto de alunos, cada uma com o nome e a nota.
     Em seguida exiba o nome dos alunos que possuem a nota maior do que a média da turma
     */
    public static void main(String[] args) {
        int totalAlunos;
        double notasTotal = 0;
        double media;

        Scanner tc = new Scanner(System.in);
        System.out.println("Informe a quantidade de alunos: ");
        totalAlunos=tc.nextInt();

        String alunos[] = new String[totalAlunos];
        double notas[] = new double[totalAlunos];

        for(int i=0; i< totalAlunos; i++){

            System.out.println("Informe o nome do aluno "+(i+1)+": ");
            alunos[i]=tc.next();
            System.out.println("Informe a nota do aluno "+(i+1)+": ");
            notas[i]=tc.nextDouble();

            notasTotal+=notas[i];

        }
        media=notasTotal/totalAlunos;

        System.out.println("Notas superiores a média");

        for (int i = 0; i <totalAlunos; i++) {
            if (notas[i]>=media){
                System.out.println("Aluno: "+alunos[i]+" Nota: "+notas[i]);
            }
        }

    }
}
