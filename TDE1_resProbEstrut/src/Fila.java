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

        // caso para inicio
        if (fim <= 0) dados[fim] = elemento;
        else if (cheia()) {
            // exceção fila cheia
            throw new FilaCheiaException();
            // TODO: catch
        // wrap
        } else if ((fim + 1) >= dados.length){
            dados[fim] = elemento;
            fim = 0;
        } else {
            // caso geral
            dados[fim] = elemento;
            fim++;
        }
    }

    // Retira objeto do fim da fila
    public int retirar(){
        int elemento;

        if (vazia()) {
            throw new FilaVaziaException();
            return -1;
        } else {
            elemento = dados[inicio];

            // wrap
            if ( (inicio + 1) >= dados.length ) inicio = 0;
            else inicio++;

            return elemento;
        }
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
