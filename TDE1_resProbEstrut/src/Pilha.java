public class Pilha {
    private int topo;
    private int dados[];
    private int MAX;

    public Pilha(int MAX)
    {
        dados = new int[MAX];
        topo = 0;
    }

    public int getTopo() { return topo; }

    // Adicionar ao topo da pilha
    public void adicionar(int novo_item) {
        // inserir apenas se não exceder tamanho da stack
        if (!cheia()){
            dados[topo + 1] = novo_item;
            topo += 1;
        }
        else throw Exception;
            // TODO: essa exceção
            // Exceção -> msg + imprimir stack
            // System.out.println("A pilha já está cheia!");

    }

    // Retirar obj no topo da pilha
    // Deve retornar int em pilha[topo]
    public int retirar() {
        if (dados[topo] != 0){
            int elemento = dados[topo];
            topo--;
            return elemento;
        }
        else throw Exception;
            // TODO: essa exceção
            // Exceção ≥ msg + imprimir stack
            // System.out.println("A pilha está vazia!");

    }

    private boolean vazia(){
        if (dados[topo] != 0) return false;
        else return true;
    }

    private boolean cheia(){
        if (topo < dados.length - 1) return false;
        else return true;
    }

    public void imprimir()
    {
        for (int d : dados){
            if (d != 0) System.out.printf(" %d |", d);
            else System.out.print("   |");
        }
    }
}

