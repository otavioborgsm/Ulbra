import java.util.Scanner;

public class Read {
    Scanner sc = new Scanner(System.in);


    public String lerString(){
        return lerString("Digite uma String: ");
    }
    public String lerString(String msg){
        System.out.print(msg);
        return sc.next();
    }

    public char lerChar(){
        System.out.print("Digite um Char: ");
        String lida = sc.next();
        return lida.charAt(0);
    }
    public char lerChar(String msg){
        System.out.print(msg);
        return sc.next().charAt(0);
    }

//Segunda parte:

    public String lerEmail(){
        String email = lerString("Digite um email: ");

        if (!email.contains("@")){
            email = "null";
        }
        return email;
    }


    public String lerTelefone(){
        String telefone = lerString("Digite seu número de telefone: ");
        if (!telefone.contains("")){
            telefone = "null";
        }
        return telefone;
    }
}
