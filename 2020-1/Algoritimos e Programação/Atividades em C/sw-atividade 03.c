/******************************************************************************
3. Escrever um algoritmo que leia um código e três valores: a, b e c.
Os códigos válidos são 1, 2, 3, 4 e 5.
Se o código for diferente destes, apresentar a mensagem "CÓDIGO INVÁLIDO" e terminar o programa.
- código = 1: multiplicar os três valores;
- código = 2: somar os três valores;
- código = 3: subtrair os três valores;
- código = 4: somar o quadrado dos 3 valores;
- código = 5: apenas escrever os 3 valores.

*******************************************************************************/

#include <stdio.h>

int main()
{
int num, num1, num2, cod, op;

    printf("digite um numero: ");
    scanf("%i",&num);
    printf("digite outro numero: ");
    scanf("%i",&num1);
    printf("digite mais um numero: ");
    scanf("%i",&num2);
    printf("digite um codigo (1, 2, 3, 4 e 5): ");
    scanf("%i",&cod);
   
switch(cod){
    case 1:
        op=num*num1*num2;
        printf("\nresultado: %i", op);
    break;
    case 2:
        op=num+num1+num2;
        printf("\nresultado: %i", op);
    break;
    case 3: 
        op=num-num1-num2;
        printf("\nresultado: %i", op);
    break;
    case 4:
        op=(num*num)+(num1*num1)+(num2*num2);
        printf("\nresultado:%i", op);
    break;
    case 5:
        printf("resultado: %i, %i, %i.", num, num1, num2);
    break;    
    default: 
        printf("\n CODIGO INVALIDO");
    break;    
}
    return 0;
}

