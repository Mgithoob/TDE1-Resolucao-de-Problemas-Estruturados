public class Pilha {
    private int topo;
    private int[] dados;

    public Pilha(int tamanho)
    {
        dados = new int[tamanho];
        topo = 0;
    }

    public int getTopo() { return topo; }

    // Adicionar ao topo da pilha
    public void adicionar(int novo_item) {
        // inserir apenas se não exceder tamanho da stack
        try{
            if (!cheia()){
                dados[topo + 1] = novo_item;
                topo += 1;
            }
            else throw new PilhaCheiaException();
            // TODO: essa exceção
            // Exceção -> msg + imprimir stack
            // System.out.println("A pilha já está cheia!");
        } catch (PilhaCheiaException e){

        }


    }

    // Retirar obj no topo da pilha
    // Deve retornar int em pilha[topo]
    public int retirar() {
        try{
            if (dados[topo] != 0){
                int elemento = dados[topo];
                topo--;
                return elemento;
            }
            else throw new PilhaVaziaException();
            // TODO: essa exceção
            // Exceção ≥ msg + imprimir stack
            // System.out.println("A pilha está vazia!");
        } catch (PilhaVaziaException e){

            // Fluxo do programa será interrompido de qualquer forma.
            return -1;
        }
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
