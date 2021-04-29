
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int resposta;
        int id;

        ArrayList <Item> produtos = new ArrayList<>();

        Scanner as = new Scanner(System.in);

        do {

            System.out.println(" 1 - Adicionar Produto\n 2 - Remover Produto\n 3 - Lisar itens\n 4 - Ver total da lista\n 5 - Encerrar programa");
            resposta= as.nextInt();

            switch(resposta){

               case 1:

                   System.out.println("Informe o nome do produto: ");
                   as.nextLine();
                   String prod = as.nextLine();

                   System.out.println("Informe a quantidade do produto: ");
                   int quant = as.nextInt();

                   System.out.println("Informe o valor do produto: ");
                   double preco = as.nextDouble();

                   double totalProduto = quant*preco;
                   System.out.println("Valor total: " +totalProduto+"\n");

                   Item produto = new Item(prod, quant, preco, totalProduto);

                   produtos.add(produto);

                break;

                case 2:

                    System.out.println("Informe o ID do produto que deseja remover: ");
                    id = as.nextInt();

                    Item item = new Item(id);
                    produtos.remove(item);

                    break;

                case 3:

                    if (produtos.size()>0) {
                        for (int i = 0; i <produtos.size(); i++) {
                            produtos.get(i).infoItem();
                        }
                    }else{
                        System.out.println("Não há produtos na lista");
                    }


                break;

                case 4:

                    System.out.println("Valor total do pedido: "+Item.valorPedido);

                break;

                case 5:

                    System.out.println("--- Programa Encerrado ---");

                break;

                default:

                    System.out.println("Código inválido!!!");

                break;

            }

        }while(resposta !=5);
    }
}
