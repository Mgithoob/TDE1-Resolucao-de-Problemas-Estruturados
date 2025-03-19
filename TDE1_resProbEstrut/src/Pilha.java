public class Pilha {
    private int topo;
    private int dados[];

    public Pilha(int qtde)
    {
        dados = new int[qtde];
        topo = 0;
    }

    public int getTopo() { return topo; }

    // Adicionar ao topo da pilha
    public void adicionar(int novo_item) {
        dados[topo + 1] = novo_item;
        topo += 1;
        // e se exceder tamanho do vetor?
        // ao fim att topo

        // 
    }

    // Retirar obj no topo da pilha
    // Deve retornar int em pilha[topo]
    public int retirar()
    {
        return dados[topo];
    }

    public void imprimir()
    {

    }
}
