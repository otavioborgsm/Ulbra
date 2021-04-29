import meuPacote.ValidaCPF;
import java.util.Objects;
import java.util.Scanner;

public class Titular {

    Scanner tc = new Scanner(System.in);

        String cpf;
        String nome;
        int idade;
        String data_nascimento;
        double renda;

        public Titular(String nom, String cp, String nasc, int id, double rend){

            this.nome = nom;
            this.cpf= cp;
            this.idade=id;
            this.data_nascimento = nasc;
            this.renda = rend;

            do{

                if (!ValidaCPF.isCPF(cpf)) {

                    System.out.print("Erro, CPF invalido !!!");
                    System.out.print("\nInforme novamente o documento: ");
                    this.cpf = tc.next();

                }

            }while (!ValidaCPF.isCPF(cpf));

            do {

                if (idade < 16){
                    System.out.println("Idade inválida!");
                    System.out.print("\nInforme novamente a idade: ");
                    this.idade = tc.nextInt();
                }

            }while(idade < 16);

        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Titular cliente = (Titular) o;
            return Objects.equals(cpf, cliente.cpf);
        }

        @Override
        public int hashCode() {
            return Objects.hash(cpf);
        }

        @Override
        public String toString() {
            return "cpf='" + cpf + '\'' + ", nome='" + nome + '\'' + ", idade=" + idade + ", data_nascimento='" + data_nascimento + '\''+ ", renda='" + renda + '\'';
        }


}


