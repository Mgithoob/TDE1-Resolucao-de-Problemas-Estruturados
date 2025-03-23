public class Fila {
    private int inicio;
    private int fim;

    private int[] dados;

    public Fila(int tamanho) {
        dados = new int[tamanho];
        inicio = 0;
        fim = 0;
    }

    // Insere objeto no começo da fila
    public void inserir(int elemento){

        if (inicio <= 0) dados[fim] = elemento;
        else if (inicio == fim) {
            // exceção fila cheia
        } else if ((fim + 1) > dados.length){
            dados[fim] = elemento;
            fim = 0;
        }
        /*
        dados[fim] = elemento;
        fim++;
        */

        // TODO: PENSAR EM WRAP!
    }

    // Retira objeto do fim da fila
    public int retirar(){
        int elemento;
        elemento = dados[inicio];

        return inicio;

        //TODO: VER WRAP!
    }

    public boolean cheia(){
        if ((inicio + 1 == fim) || (inicio - 1 == fim)) return true;
        else return false;
    }

    public boolean vazia(){
        if ((inicio == fim)) return true;
        else return false;
    }

}
