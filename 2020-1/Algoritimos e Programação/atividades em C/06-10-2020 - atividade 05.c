/******************************************************************************
5.	 Faça um algoritmo, ou programa em linguagem C, para ler um vetor de 10 elementos inteiros e um valor N.
Listar todos os valores do vetor e em seguida, listar o vetor multiplicado pelo valor N.




*******************************************************************************/

#include <stdio.h>

int main(){
    int x, pares=0, num[10], n;
    for(x=0;x<=9;x++){
        printf("Digite um número inteiro: ");
        scanf("%i", &num[x]);
    }
    printf("\nEscolha um número para multiplica-los: ");
    scanf("%i", &n);
    for(x=0;x<=9;x++){
        printf("\nResultado do Número [%i]: %i",num[x],num[x]*n);
    }
    return 0;
}
