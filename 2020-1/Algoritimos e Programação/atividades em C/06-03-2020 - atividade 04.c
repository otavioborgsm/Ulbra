/******************************************************************************
4. Faça um algoritmo, ou programa em linguagem C, que leia um vetor de 10 elementos.
Deve calcular e imprimir a soma de todos os valores existentes no vetor.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int x ;
    float soma=0, vet[10];

        for(x=0; x<=9; x++){
            
            printf("\nDigite um número: ");
            scanf("%f", &vet[x]);
            soma= soma + vet[x];
        }
        printf("Soma total dos números: %.2f ",soma);
    return 0;
}
