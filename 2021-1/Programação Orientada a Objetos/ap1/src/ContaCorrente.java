import java.util.Objects;
import java.util.Scanner;

public class ContaCorrente {

    public String agencia;
    public int numero;
    public static int ultimaConta=1;
    public double saldo;
    public double limite;
    public Titular titular;
    public Titular titular2;

    Scanner tc = new Scanner(System.in);

    public ContaCorrente(String agn) {

        this.agencia = agn;
        this.numero = ultimaConta;
        this.saldo = 0;

        System.out.print("\nNome: ");
        String nom = tc.next();

        System.out.print("\nCPF: ");
        String cp = tc.next();

        System.out.print("\nIdade: ");
        int id = tc.nextInt();

        System.out.print("\nData de nascimento: ");
        String nasc = tc.next();

        System.out.print("\nRenda mensal: ");
        double rend = tc.nextDouble();

        Titular cliente = new Titular(nom, cp, nasc, id , rend);

        this.titular = cliente;
        System.out.print("\nConta conjunta (1 - SIM 2 - NAO)? ");
        int resposta = tc.nextInt();

        if (resposta==1){

            System.out.print("\nNome: ");
            String nom2 = tc.next();

            System.out.print("\nCPF: ");
            String cp2 = tc.next();

            System.out.print("\nIdade: ");
            int id2 = tc.nextInt();

            System.out.print("\nData de nascimento: ");
            String nasc2 =tc.next();

            System.out.print("\nRenda mensal: ");
            double rend2 = tc.nextDouble();

            Titular cliente2 = new Titular(nom2, cp2, nasc2, id2 , rend2);
            this.titular2 = cliente2;

            if (this.titular.idade > 60 || this.titular2.idade > 60) {
                this.limite = 1000;
            } else if (this.titular.idade < 18 || this.titular2.idade < 18){
                this.limite = 100;
            } else{
                this.limite = 300;
            }

        }else{
            this.titular2 = null;

            if (this.titular.idade > 60) {
                this.limite = 1000;
            } else if (this.titular.idade < 18){
                this.limite = 100;
            } else{
                this.limite = 300;
            }

        }

        ultimaConta++;
    }

    public ContaCorrente(int busca) {
        numero = busca;
    }

    public void infoCliente(){
        System.out.println("-------------------------");
        System.out.println("Número: "+this.numero);
        System.out.println("Cliente: "+this.titular.nome);
        System.out.println("Agencia: "+this.agencia);
        System.out.println("CPF: "+this.titular.cpf);
        System.out.println("Idade: "+this.titular.idade);
        System.out.println("Renda: "+this.titular.renda);
        System.out.println("-------------------------");

        if (this.titular2 != null){
            System.out.println("Titular 2:");
            System.out.println("Cliente: "+this.titular2.nome);
            System.out.println("CPF: "+this.titular2.cpf);
            System.out.println("Idade: "+this.titular2.idade);
            System.out.println("Renda: "+this.titular2.renda);
            System.out.println("-------------------------");
        }
    }




    public boolean transferencia(double valor, ContaCorrente destino){
        if(saque(valor)){
            destino.deposito(valor);
        }else{
            return false;
        }
        return false;
    }

    public boolean deposito(double valor){
        if(valor>0){
            this.saldo += valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean saque(double valor){
        if(valor<=(saldo+limite)){
            this.saldo-=valor;
            return true;
        }else{
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }

    public boolean emprestimo(double valor){
        if(valor<=(titular.renda*5)){
            this.saldo+=valor;
            return true;
        }else{
            System.out.println("Renda insuficiente!");
            return false;
        }
    }

    public void getSaldo(){

        if (titular2 == null) {

            System.out.println("-------------------------");
            System.out.println("Cliente: " + this.titular.nome);
            System.out.println("Agencia: " + this.agencia);
            System.out.println("Número: " + this.numero);
            System.out.println("Saldo: " + this.saldo);
            System.out.println("Limite: " + this.limite);
            System.out.println("Valor disponivel para saque: " + (this.limite + this.saldo));
            System.out.println("-------------------------");

        }else{

            System.out.println("-------------------------");
            System.out.println("Cliente: " + this.titular.nome);
            System.out.println("Titular 2: " + this.titular2.nome);
            System.out.println("Agencia: " + this.agencia);
            System.out.println("Número: " + this.numero);
            System.out.println("Saldo: " + this.saldo);
            System.out.println("Limite: " + this.limite);
            System.out.println("Valor disponivel para saque: " + (this.limite + this.saldo));

        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaCorrente that = (ContaCorrente) o;
        return numero == that.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}



