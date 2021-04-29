public class Main {
    /*Crie uma classe que armazena os 12 meses do ano em um array.
     A seguir, gere um valor randômico entre 0 e 11 e apresente o mês correspondente ao valor sorteado.
      Considere que o valor 0 corresponde ao mês de janeiro e o valor 11, ao mês de dezembro.
     */
    public static void main(String[] args) {

        String[] meses  = {"JANEIRO","FEVEREIRO" ,"MARÇO","ABRIL","MAIO","JUNHO","JULHO","AGOSTO","SETEMBRO","OUTUBRO","NOVEMBRO","DEZEMBRO"};

        int sorteio;
        sorteio = (int)Math.round(Math.random() * 11);
        System.out.println("O mês sorteado foi: "+meses[sorteio]);
    }
}
