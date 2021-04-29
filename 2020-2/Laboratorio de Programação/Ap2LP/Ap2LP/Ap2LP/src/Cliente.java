import java.util.Objects;
import java.util.Scanner;
import meuPacote.ValidaCPF;

public class Cliente{
    String cpf;
    String nome;
    int idade;
    String data_nascimento;

    public Cliente(String c)  {
        this.cpf = c;
    }

    public Cliente(){
        ler();
    }

    public void ler(){
        Scanner tc = new Scanner(System.in);

        do{
            System.out.print("\ndigite cpf: ");
            cpf = tc.next();


            if (ValidaCPF.isCPF(cpf)) {
                System.out.printf("%s\n", ValidaCPF.imprimeCPF(cpf));

            } else {
                System.out.print("Erro, CPF invalido !!!\n");

            }

        }while (!ValidaCPF.isCPF(cpf));


        System.out.print("\ndigite nome: ");
        this.nome=tc.next();
        do {
            System.out.print("\ndigite sua idade: ");
            this.idade=tc.nextInt();
            if (idade < 16){
                System.out.println("Idade inválida!");
            }

        }while(idade < 16);

        System.out.print("\ndigite sua data de nascimento: ");
        this.data_nascimento=tc.next();


    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cpf, cliente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "cpf='" + cpf + '\'' + ", nome='" + nome + '\'' + ", idade=" + idade + ", data_nascimento='" + data_nascimento + '\'';
    }


}
