public class Main {
    public static void main(String[] args) {
        Read read = new Read();

        String nome = read.lerString("Digite seu nome: ");
        char sexo = read.lerChar("Digite seu sexo: ");
        String email = read.lerEmail();

        System.out.println(nome);
        System.out.println(sexo);
        System.out.println(email);
    }
}