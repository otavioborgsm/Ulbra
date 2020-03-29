/******************************************************************************
Faça um algoritmo para ler três números e verificar se a soma deles é maior
que 50. Se for, escrever uma mensagem informando.

*******************************************************************************/

#include <stdio.h>

    int main()
    {
    int num1, num2, num3;
    
        printf("digite um numero: ");
        scanf("%i",&num1);
        printf("digite outro numero: ");
        scanf("%i",&num2);
        printf("digite mais um numero: ");
        scanf("%i",&num3);
        
    if (num1+num2+num3>=50){
        printf("a soma e maior que 50!!");
    }
    else if(num1+num2+num3<50){
        printf("a soma nao e maior que 50!!");
    }

    return 0;
    }
