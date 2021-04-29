import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String frase;
        String palavra;
        int tamanho;

        System.out.print("Digite uma frase: ");
        frase = ler.nextLine();

        do {
            System.out.println("Digite uma palavra e até 5 letras: ");
            palavra = ler.nextLine();

            tamanho = palavra.length();
        }while (tamanho>5);

        Boolean igual = frase.contains(palavra);

        if(igual == true){
            System.out.print("Palvra contém na frase!!");
        }else{
            System.out.print("Palavra não existe na frase!!");
        }
    }
}
