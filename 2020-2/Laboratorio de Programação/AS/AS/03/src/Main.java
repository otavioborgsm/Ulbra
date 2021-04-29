import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double valorDolar;
        double valorBitCoin;
        double valorReal;
        double valorDolarReal;
        double valorFinal;
        int escolha;

        Scanner ler= new Scanner(System.in);

        System.out.print("Qual conversão deseja realizar?\n1 - Reais em Dólar\n2 - Reais em BitCoin\n3 - Dólares em Reais\n4 - Dólares em Bitcoin\n");
        escolha = ler.nextInt();

        switch (escolha){

            case 1:

                Conversao Rd = new  Conversao();

                valorDolar=Rd.Real()/Rd.Dolar();
                System.out.printf("O valor em Dolar será de: %.2f ",valorDolar);

            break;

            case 2:

                Conversao Rb = new  Conversao();

                valorBitCoin=Rb.Real()/Rb.Bitcoin();
                System.out.printf("O valor em Bitcoin será de: %.6f ",valorBitCoin);

            break;

            case 3:

                Conversao Dr = new  Conversao();

                valorReal=Dr.Dol()*Dr.Dolar();
                System.out.printf("O valor do Dolar em Real é de: %.2f ",valorReal);

            break;

            case 4:

                Conversao dB = new  Conversao();

                valorDolarReal=dB.Dol()*dB.Dolar();
                System.out.printf("Valor em Bitcoin: %.6f ",valorDolarReal/dB.Bitcoin());
            break;

            default:

                System.out.println("Código inválido!!");

            break;
        }
    }
}