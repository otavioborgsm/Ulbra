/******************************************************************************
2. Agora faça um algoritmo que calcule a média aritmética de 5 alunos e armazene em um vetor.
Para calcular a média é necessário ler duas notas para cada aluno.
No final, exiba na telas as médias dos alunos.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int x ;
    float  nota1, nota2, media[5];

        for(x=0; x<=4; x++){
            
            printf("\nNotas do aluno[%i]",x+1);
            printf("\nPrimeira nota: ");
            scanf("%f", &nota1);
            printf("Segunda nota: ");
            scanf("%f", &nota2);
            media[x] = (nota1+nota2)/2;
            printf("Média das notas: %.2f",media[x]);
        }
        for(x=0; x<=4; x++){
            printf("\nNota média do aluno [%i]: [%.2f]", x+1, media[x]);
        }
    

    return 0;
}
