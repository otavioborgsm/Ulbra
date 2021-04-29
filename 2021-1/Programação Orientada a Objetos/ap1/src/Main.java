import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int resp;
        Scanner tc = new Scanner(System.in);
        int posicaoC1;

        ArrayList<ContaCorrente> contaCorrentes= new ArrayList<>();

        do {

            System.out.println("\nSelecione a operação:\n1 - Criar uma nova conta\n2 - Saque \n3 - Depósito\n4 - Transferência \n5 - Extrato \n6 - Empréstimo\n7 - Finalizar Sessão \n");
            resp = tc.nextInt();

            switch (resp) {

                case 1: {

                    System.out.println("----- INFORME OS DADOS DO CLIENTE: -----");

                    System.out.print("\nAgencia: ");
                    String agn = tc.next();

                    ContaCorrente correntista = new ContaCorrente(agn);

                    if (contaCorrentes.size() == 0) {

                        contaCorrentes.add(correntista);
                        correntista.infoCliente();
                        System.out.println("Cliente cadastrado!");

                    }else{

                        boolean existe = false;
                        for (int i = 0; i < contaCorrentes.size(); i++) {

                            if (correntista.titular.equals(contaCorrentes.get(i).titular)){

                                existe = true;
                                System.out.println("Conta inválida! Divergencia nos documentos.");

                            }

                        }

                        if (existe == false) {

                            contaCorrentes.add(correntista);
                            correntista.infoCliente();
                            System.out.println("Cliente cadastrado!");

                        }
                    }
                }
                break;

                case 2: {

                    if(contaCorrentes.size()==0) {

                        System.out.println("Não há contas o suficiente para realizar a operação.");

                    }else {

                        System.out.println("----- SAQUE -----");

                        System.out.print("\nInforme o número da conta que deseja realizar a operação: ");
                        int busca= tc.nextInt();

                        ContaCorrente correntista = new ContaCorrente(busca);

                        posicaoC1 = contaCorrentes.indexOf(correntista);
                        if (posicaoC1>=0){

                            ContaCorrente c1 =contaCorrentes.get(posicaoC1);

                            System.out.println("\nDigite o valor do saque: ");
                            double saque = tc.nextDouble();

                            c1.saque(saque);
                            c1.getSaldo();

                        }else{
                            System.out.println("Conta não encontrada!!");
                        }
                    }
                }
                break;

                case 3: {

                    if(contaCorrentes.size()==0) {

                        System.out.println("Não há contas o suficiente para realizar a operação.");

                    }else {

                        System.out.println("----- DEPÓSITO -----");

                        System.out.print("\nInforme o número da conta que deseja realizar a operação: ");
                        int busca= tc.nextInt();

                        ContaCorrente correntista = new ContaCorrente(busca);

                        posicaoC1 = contaCorrentes.indexOf(correntista);

                        if (posicaoC1>=0){

                            ContaCorrente c1 =contaCorrentes.get(posicaoC1);

                            System.out.println("\nDigite o valor do deposito: ");
                            double deposito = tc.nextDouble();

                            c1.deposito(deposito);
                            c1.getSaldo();

                        }else{
                            System.out.println("Conta não encontrada!!");
                        }
                    }
                }
                break;

                case 4: {
                    if(contaCorrentes.size()<=1) {

                        System.out.println("Não há contas o suficiente para realizar a operação.");

                    }else {

                        System.out.println("----- TRANSFERÊNCIA -----");

                        System.out.print("\nInforme o número da conta que deseja realizar a operação: ");
                        int busca = tc.nextInt();
                        ContaCorrente correntista = new ContaCorrente(busca);

                        posicaoC1 = contaCorrentes.indexOf(correntista);

                        if (posicaoC1 >= 0) {
                            ContaCorrente c1 = contaCorrentes.get(posicaoC1);

                            System.out.print("\nInforme o número da conta que deseja transferir o dinheiro: ");
                            int busca2 = tc.nextInt();

                            ContaCorrente correntista2 = new ContaCorrente(busca2);

                            int posicaoC2 = contaCorrentes.indexOf(correntista2);

                            if (posicaoC2 >= 0) {
                                ContaCorrente c2 = contaCorrentes.get(posicaoC2);
                                System.out.println("\nDigite o valor da transferência: ");
                                double ops = tc.nextDouble();

                                c1.transferencia(ops, c2);

                                System.out.println("Transferência realizada!");
                                c1.getSaldo();
                                c2.getSaldo();

                            } else {
                                System.out.println("Conta não encontrada!!");
                            }

                        } else {
                            System.out.println("Conta não encontrada!!");
                        }
                    }
                }break;

                case 5: {

                    if(contaCorrentes.size()==0) {

                        System.out.println("Não há contas o suficiente para realizar a operação.");

                    }else {

                        System.out.print("\nInforme o número da conta que deseja realizar a operação: ");
                        int busca = tc.nextInt();

                        ContaCorrente correntista = new ContaCorrente(busca);

                        posicaoC1 = contaCorrentes.indexOf(correntista);

                        if (posicaoC1>=0){

                            ContaCorrente c1 =contaCorrentes.get(posicaoC1);

                            c1.getSaldo();
                            c1.infoCliente();

                        }else{
                            System.out.println("Conta não encontrada!!");
                        }
                    }
                }break;

                case 6:{

                    if(contaCorrentes.size()==0) {

                        System.out.println("Não há contas o suficiente para realizar a operação.");

                    }else {

                        System.out.println("----- EMPRÉSTIMO -----");

                        System.out.print("\nInforme o número da conta que deseja realizar a operação: ");
                        int busca = tc.nextInt();

                        ContaCorrente correntista = new ContaCorrente(busca);

                        posicaoC1 = contaCorrentes.indexOf(correntista);

                        if (posicaoC1>=0){

                            ContaCorrente c1 =contaCorrentes.get(posicaoC1);

                            System.out.println("\nDigite o valor do empréstimo: ");
                            double emprestimo = tc.nextDouble();

                            c1.emprestimo(emprestimo);
                            c1.getSaldo();


                        }else{
                            System.out.println("Conta não encontrada!!");
                        }
                    }
                }break;

                case 7: {

                    System.out.println("Programa encerrado. Tenha um bom dia!");


                }break;

                default: {

                    System.out.println("Código invalido!!");

                }break;
            }

        }while (resp != 7);
    }
}