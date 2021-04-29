import java.util.Scanner;

public class Main {
    /*Escreva uma classe que Leia 5 nomes e notas de uma turma,
         calcula e exibe a média das notas da turma e em seguida exibe a relação de nomes cuja nota é superior a esta média.
         Utilize vetores para armazenar as notas.
         */

    public static void main(String[] args) {
        String alunos[] = new String[5];
        double notas[] = new double[5];
        double notasTotal = 0;
        double media;

        Scanner tc = new Scanner(System.in);

        for(int i=0; i<= 4; i++){

            System.out.println("Informe o nome do aluno: ");
            alunos[i]=tc.next();
            System.out.println("Informe a nota do aluno: ");
            notas[i]=tc.nextDouble();

            notasTotal+=notas[i];

        }

        media=notasTotal/5;

        for (int i = 0; i <= 4; i++) {
            if (notas[i]>=media){
                System.out.println("Aluno: "+alunos[i]+" Nota: "+notas[i]);
            }
        }
    }
}

