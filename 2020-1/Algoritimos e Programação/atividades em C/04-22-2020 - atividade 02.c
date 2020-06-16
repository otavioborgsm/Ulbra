/******************************************************************************
Faça um algoritmo para ler um número e se ele for maior do que 30, então
exibir metade do número, caso contrário, imprimir o dobro do número.

*******************************************************************************/

#include <stdio.h>

    int main()
    {
    float num, dobro, metade;
    
        printf("digite um numero: ");
        scanf("%f",&num);

    if (num>=30){
        metade=num/2;
        printf("a metade deste numero e: %.2f",metade);
    }
    else if(num<30){
        dobro=num*2;
        printf("o dobro deste numero e: %.0f",dobro);
    }

    return 0;
    }
