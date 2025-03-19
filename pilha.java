
public class pilha {
    public int MAX;
    public int[] dados;
    public int topo;

    public pilha() {
        this.MAX = 5;
        this.dados = new int[this.MAX];
        this.topo = -1;
    }

    public void insere(int elemento) {
        if (this.cheia()) {
            System.out.println("ERROR - pilha ta cheia");
            return;
        }
        this.topo = this.topo + 1;
        this.dados[this.topo] = elemento;
        System.out.println("OK - inserido");
    }

    public boolean cheia() {
        return (this.topo == this.MAX - 1);
    }

    public boolean vazia() {
        return (this.topo == -1);
    }

    public Integer remove() {
        if (this.vazia()) {
            System.out.println("ERROR - pilha ta vazia");
            return null;
        }
        int elemento = this.dados[this.topo];
        this.topo = this.topo - 1;
        System.out.println("OK - removido");
        return elemento;
    }

    public Integer consultarTopo(){
        if (this.vazia()){
            System.out.println("ERROR - pilha ta vazia");
            return null;
        }
        return this.dados[this.topo];
    }

    public void imprime() {
        System.out.print("Pilha = ");
        for (int i = 0; i <= this.topo; i++) {
            System.out.print(this.dados[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
