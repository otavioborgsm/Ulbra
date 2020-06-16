/******************************************************************************
1. Faça um algoritmo, ou programa em linguagem C,
que leia os salários de 10 funcionários de uma empresa e após exiba os salários e o salário mais alto.
*******************************************************************************/

#include <stdio.h>

int main(){
int x;
float salario[10], maior_salario=0;


    for(x=0;x<=9;x++){
        printf("\nInforme o salário do funcionário %i: ", x+1);
        scanf("%f", &salario[x]);
        if(salario[x] > maior_salario)
            maior_salario=salario[x];
    }
    for(x=0; x<=9; x++){
            printf("\nSalario do funcionário %i: %.2f", x+1, salario[x]);
        }
    printf("\nMaior salário da empresa: %.2f", maior_salario);
return 0;
}
    