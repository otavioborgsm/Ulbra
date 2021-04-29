import java.util.Scanner;

public class Conversao {

    public double Dolar(){
        double dolores;

        Scanner ler=new Scanner(System.in);

        System.out.println("Informe a cotação do Dolar: ");
        dolores=ler.nextDouble();

        return dolores;
    }

    public double Bitcoin(){
        double bit;

        Scanner ler=new Scanner(System.in);

        System.out.println("Informe a cotação do Bitcoin: ");
        bit=ler.nextDouble();

        return bit;
    }

    public double Real(){
        double reais;

        Scanner ler= new Scanner(System.in);

        System.out.println("Informe o valor em Real a ser convertido: ");
        reais=ler.nextDouble();

        return reais;
    }

    public double Dol(){
        double dol;

        Scanner ler=new Scanner(System.in);

        System.out.println("Informe o valor em Dolar a ser convertido: ");
        dol= ler.nextDouble();

        return dol;
    }


}

