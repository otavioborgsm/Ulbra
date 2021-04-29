import java.util.Objects;

public class Item {

    public int idProduto;
    public static int ultimoProduto=1;
    public String nome;
    public int quantidade;
    public double valor;
    public double valorTotal;
    public static double valorPedido = 0;


    public Item(String prod, int quant, double preco, double totalProduto){

        this.nome=prod;
        this.quantidade=quant;
        this.valor=preco;
        this.valorTotal=totalProduto;
        this.idProduto = ultimoProduto;

        ultimoProduto++;
        valorPedido += valorTotal;
    }

    public Item(int id){
        this.idProduto=id;
    }

    public void infoItem(){
        System.out.println("ID: "+this.idProduto +" || Produto: "+this.nome+" || Quantidade: "+this.quantidade+" || Valor unitário: "+ this.valor+" || Valor total: "+this.valorTotal+"\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return idProduto == item.idProduto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduto);
    }
}
