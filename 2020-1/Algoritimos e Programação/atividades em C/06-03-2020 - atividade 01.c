/******************************************************************************
1. Faça um algoritmo, ou programa em linguagem C, que leia as notas de 10 alunos de uma turma e armazene em um vetor e depois exiba na telas todas as notas.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int x, alunos;
    float vet[10];

        for(x=0; x<=9; x++){
            
            printf("Digite a nota do aluno [%i]: ",x+1);
            scanf("%f", &vet[x]);
        }
        for(x=0; x<=9; x++){
            printf("\nNota do aluno [%i]: [%.2f]", x+1, vet[x]);
        }
    

    return 0;
}
