/******************************************************************************
4.	Fazer um programa para ler um vetor de inteiros positivos de 20 posições  (somente aceitar números positivos) .
Imprimir a quantidade de números pares.


*******************************************************************************/

#include <stdio.h>

int main(){
    int x, pares=0, num[20];
    for(x=0;x<=19;x++){
        do{
            printf("Digite um número: ");
            scanf("%i", &num[x]);
        }while(num[x]<=0);
        if(num[x]% 2 == 0)
            pares=pares+1;
    }
    printf("\nTotal de números pares: %i", pares);
    return 0;
}
