/******************************************************************************
3. Continuando o algoritmo da questão anterior, ao invés de armazenar no vetor as médias, armazene números inteiros sendo 1 para “APROVADO”ou 2 para “REPROVADO”.
Para ser aprovado um aluno tem que ter a média maior ou igual a nota 7.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int x ;
    float  nota1, nota2, media, status[5];

        for(x=0; x<=4; x++){
            
            printf("\nNotas do aluno[%i]",x+1);
            printf("\nPrimeira nota: ");
            scanf("%f", &nota1);
            printf("Segunda nota: ");
            scanf("%f", &nota2);
            media = (nota1+nota2)/2;
            printf("Média das notas: %.2f",media);
            if(media>=7)
                status[x]=1;
            else
                status[x]=2;
        }
        for(x=0; x<=4; x++){
            if(status[x]==1)
                printf("\nAluno [%i]: Aprovado!", x+1);
            else
                printf("\nAluno [%i]: Reprovado!", x+1);
            
        }
    

    return 0;
}
