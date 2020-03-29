/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

    int main()
    {
    int num;
        printf("digite um numero:");
        scanf("%i",&num);

    if (num >=100 || num==1000)

        printf("\n esta dentro da faixa!!");
    else
    {
        printf("nao esta dentro da faixa!!");
    }

    return 0;
}
