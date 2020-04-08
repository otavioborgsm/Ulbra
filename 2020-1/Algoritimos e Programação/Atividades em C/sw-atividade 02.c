/******************************************************************************
2. Faça um algoritmo que leia um número.
Se o número for 1, escreva o número. Se o número for 2, escreva o dobro do número.
Se o número for 3, escreva o triplo do número.
Se for outro número, escreva a mensagem “número não esperado”.
*******************************************************************************/

#include <stdio.h>

int main()
{
int num;
    printf("digite um numero: ");
    scanf("%i",&num);
    
switch(num){
    case 1: printf("Um\n");
    break;
    case 2: printf("Quatro\n");
    break;
    case 3: printf("Nove\n");
    break;
    default: printf("numero nao esperado\n");
}
    return 0;
}

