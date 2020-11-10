
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente();

        Scanner op = new Scanner(System.in);
        System.out.println("Selecione a operação:\n1 - Saque \n2 - Depósito\n3 - Transferência \n4 - Extrato");
        int operacoes = op.nextInt();

        c1.lerDados();

        switch (operacoes) {

            case 1:

                Scanner lerSaque = new Scanner(System.in);
                System.out.println("Digite o valor do saque: ");

                double saque = lerSaque.nextDouble();
                c1.saque(saque);
                c1.getSaldo();

            break;

            case 2:

                ContaCorrente cd = new ContaCorrente();

                Scanner lerDep = new Scanner(System.in);
                System.out.println("Digite o valor do Deposito: ");

                double deposito = lerDep.nextDouble();
                c1.deposito(deposito);
                c1.getSaldo();

            break;

            case 3:

                ContaCorrente c2 = new ContaCorrente();
                c2.lerDados();

                Scanner lerOperacoes = new Scanner(System.in);
                System.out.println("Digite o valor da transferencia: ");
                double ops = lerOperacoes.nextDouble();

                if (c1.titular.cpf.equals(c2.titular.cpf)) {
                    System.out.println("Não foi possível realizar a transferência, divergencia nos documentos.");
                } else {
                    c1.transferencia(ops, c2);
                    System.out.println("transferencia realizada");
                    c1.getSaldo();
                    c2.getSaldo();
                }
            break;

            case 4:

                c1.getSaldo();

            break;
            default:

                System.out.println("Código invalido!!");

            break;
        }
    }
}
