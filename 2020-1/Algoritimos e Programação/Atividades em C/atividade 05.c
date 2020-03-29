/******************************************************************************
Faça um algoritmo para entrar com código, sexo e idade de uma pessoa. Se a
pessoa for do sexo feminino e tiver menos que 25 anos, imprimir código e
mensagem: ACEITA. Caso contrário, imprimir código e a mensagem: NÃO
ACEITA.

*******************************************************************************/

#include <stdio.h>

    int main()
    {
    int idade;
    char sexo;
    
        printf("sexo (F ou M): ");
        scanf("%c",&sexo);
        
        printf("idade: ");
        scanf("%i",&idade);
        
    if (sexo == 'F' && idade<25){
        printf("\naceita");
    }
    else 
    {
        printf("\nnao aceita");
    }
    return 0;
    }
