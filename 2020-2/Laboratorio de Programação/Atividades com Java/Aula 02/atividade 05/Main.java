import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double valorProduto, valorFinal = 0;
    String nomeProduto;
    Scanner input = new Scanner(System.in);

    System.out.println("digite o nome do produto:");
    nomeProduto=input.next();
    System.out.println("digite o valor do produto:");
    valorProduto=input.nextFloat();
    input.close();
    if(valorProduto>=50 && valorProduto<200){
        valorFinal= valorProduto * 0.95;
        System.out.printf("O valor do produto %s com desconto é: %.2f", nomeProduto, valorFinal);
    }
    if(valorProduto>=200 && valorProduto<500 ){
        valorFinal = valorProduto*0.94;
        System.out.printf("O valor do produto %s com desconto é: %.2f", nomeProduto, valorFinal); 
    }
    if(valorProduto>=500 && valorProduto< 1000){
        valorFinal = valorProduto*0.93;
        System.out.printf("O valor do produto %s com desconto é: %.2f", nomeProduto, valorFinal);
    }
    if(valorFinal>=1000){
        valorFinal = valorProduto*0.92;
        System.out.printf("O valor do produto %s com desconto é: %.2f", nomeProduto, valorFinal);
    }
    if(valorProduto < 0)
    {
      System.out.println("Valor inválido. Digite um valor maior que 0.");
    }
  }
}