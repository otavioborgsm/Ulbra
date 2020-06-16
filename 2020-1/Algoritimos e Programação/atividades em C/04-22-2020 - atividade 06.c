/******************************************************************************
Fazer um algoritmo que leia o percurso em quilômetros, o tipo do carro e
informe o consumo estimado de combustível, sabendo-se que um carro tipo C
faz 12 Km com um litro de gasolina, um tipo B faz 9 Km e o tipo A, 8 Km por
litro.

*******************************************************************************/

#include <stdio.h>

    int main()
    {
    float km, combustivel;
    char carro;
    
        printf("tipo de carro (A, B ou C): ");
        scanf("%c",&carro);
        
        printf("distencia do percurso (km): ");
        scanf("%f",&km);
        
    if (carro == 'A'){
        combustivel=km*0.125;
        printf("\ntotal de combustivel consumido sera: %.2f",combustivel);
    }
    else if (carro == 'B'){
        combustivel=km/9;
        printf("\ntotal de combustivel consumido sera: %.2f",combustivel);
    }
    else if (carro == 'C'){
        combustivel=km/12;
        printf("\ntotal de combustivel consumido sera: %.2f",combustivel);
    }
        
    return 0;
    }
