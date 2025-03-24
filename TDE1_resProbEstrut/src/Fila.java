public class Fila {
    private int inicio;
    private int fim;
    private final int MAX;

    private int[] dados;

    public Fila(int MAX) {
        this.MAX = MAX;
        dados = new int[MAX];
        inicio = 0;
        fim = 0;
    }

    // Insere objeto no começo da fila
    public void inserir(int elemento){
        try {
            // caso para inicio
            if (fim <= 0) dados[fim] = elemento;
            else if (cheia()) {
                // exceção fila cheia
                throw new FilaCheiaException();
                // TODO: catch
                // wrap
            } else if ((fim + 1) >= MAX){
                dados[fim] = elemento;
                fim = 0;
            } else {
                // caso geral
                dados[fim] = elemento;
                fim++;
            }
        } catch (FilaCheiaException e) {

        }

    }

    // Retira objeto do fim da fila
    public int retirar(){
        int elemento;

        try {
            if (vazia()) throw new FilaVaziaException();
            else {
                elemento = dados[inicio];
                // wrap
                if ( (inicio + 1) >= MAX) inicio = 0;
                else inicio++;

                return elemento;
            }
        } catch (FilaVaziaException e){
            // TODO: lidar com exceção
            return -1;
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
