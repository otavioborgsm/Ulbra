/******************************************************************************
Construa um algoritmo que leia dois números e efetue a adição. Caso o valor
somado seja maior que 20, este deverá ser apresentado somando e a ele mais
8; caso o valor somado seja menor ou igual a 20, este deverá ser apresentado
subtraindo-se 5

*******************************************************************************/

#include <stdio.h>

    int main()
    {
    int num1, num2, menos, mais;
    
        printf("digite um numero: ");
        scanf("%i",&num1);
        printf("digite outro numero: ");
        scanf("%i",&num2);
        
    if (num1+num2>20){
        mais=num1+num2+8;
        printf("o resultado e: %i",mais);
    }
    else if(num1+num2<=20){
        menos=num1+num2-5;
        printf("o resultado e: %i",menos);
    }

    return 0;
    }
