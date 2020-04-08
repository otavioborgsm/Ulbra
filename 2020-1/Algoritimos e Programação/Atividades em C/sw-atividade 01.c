/******************************************************************************
1. Faça um algoritmo que leia dois números. 
Depois pergunte se o usuário deseja somar, subtrair, multiplicar ou dividir estes números.
Realize a operação matemática que ele escolheu e logo após escreva na tela o resultado.

*******************************************************************************/

#include <stdio.h>

int main()
{
int num, num2, resultado;
char operacao;
    printf("digite um numero: ");
    scanf("%i",&num);
    printf("digite outro numero:  ");
    scanf("%i",&num2);
    printf("digite D para dividir, X para multiplicar, S para subtrair e M para somar: ");
    scanf("%c",&operacao);
    scanf("%c",&operacao);
    
if (operacao =='X'){
    resultado=num*num2;
    printf("o resultado e: %.i",resultado);
}    
else if(operacao =='D'){
    resultado=num/num2;
    printf("o resultado e: %i",resultado);
}
else if(operacao =='M'){
    resultado=num+num2;
    printf("o resultado e: %i",resultado);
}
else if(operacao =='S'){
    resultado=num-num2;
    printf("o resultado e: %i",resultado);
}    

    return 0;
}

