/******************************************************************************
3.	Faça um algoritmo, ou programa em linguagem C,
que armazene 15 números informados pelo usuário e em seguida informe quantos números 10 existe no vetor.


*******************************************************************************/

#include <stdio.h>

int main(){
    int x, total;
    float num[15];
    for(x=0;x<=14;x++){
        printf("Digite um número: ");
        scanf("%f", &num[x]);
        if(num[x]==10)
        total=total+1;
    }
    printf("\nTotal de números iguais a 10: %i", total);
    return 0;
}
