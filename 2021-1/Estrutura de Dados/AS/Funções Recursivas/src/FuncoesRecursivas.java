public class FuncoesRecursivas {


    public int somaArray(int[] array, int tamanho){
        if (tamanho == 0) {
            return array[0];
        }else{
            return array[tamanho] + somaArray(array, tamanho-1);
        }

    }


    static int validaMaior(int array[], int inicio, int tamanho) {
        if (inicio == tamanho)
            return array[inicio];

        int max = validaMaior(array, inicio+1, tamanho);

        return Math.max(array[inicio], max);
    }


}

