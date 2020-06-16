/******************************************************************************
5. Ler um vetor de 10 elementos.
Calcular e imprimir a soma dos valores maiores que 5 existentes no vetor.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int x ;
    float soma=0, vet[10];

        for(x=0; x<=9; x++){
            
            printf("\nDigite um número: ");
            scanf("%f", &vet[x]);
            if(vet[x]>5)
            soma= soma + vet[x];
        }
        printf("Soma total dos números maiores que 5: %.2f ",soma);
    return 0;
}
