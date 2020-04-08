/******************************************************************************
4. Escreva um algoritmo que tendo como dados de entrada o preço de um produto e um código de origem emita o preço junto de sua procedência.
Caso o código não seja nenhum dos especificados o produto é considerado importado.
Os códigos de origem são os seguintes:
1 - Sul 5 – Nordeste
2 – Norte 6 – Sudeste
3 – Leste 7 - Centro Oeste
4 – Oeste 8 – Noroeste

*******************************************************************************/

#include <stdio.h>

int main()
{
int num;

    printf("digite um codigo: ");
    scanf("%i",&num);
    
   
switch(num){
    case 1:
        printf("\nO valor do produto e 3,00. Sua origem e Sul");
    break;
    case 2:
        printf("\nO valor do produto e 4,00. Sua origem e Norte");
    break;
    case 3: 
        printf("\nO valor do produto e 5,00. Sua origem e Leste");
    break;
    case 4:
        printf("\nO valor do produto e 6,00. Sua origem e Oeste");
    break;
    case 5:
        printf("\nO valor do produto e 7,00. Sua origem e Nordeste");
    break;
    case 6:
        printf("\nO Valor do produto e 8,00. Sua origem e Sudeste");
    break;
    case 7:
        printf("\nO valor do produto e 9,00. Sua origem e Centro Oeste");
    break;
    case 8:
        printf("\nO valor do produto e 9,00. Sua origem e Noroeste");
    break;    
    default: 
        printf("\n Produto importado");
    break;    
}
    return 0;
}


