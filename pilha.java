
public class pilha {
    public int tamanho;
    public int[] dados;
    public int topo;

    public pilha() {
        this.tamanho = 5;
        this.dados = new int[this.tamanho];
        this.topo = 0;
    }

    public void insere(int valor) {
        if (!this.cheia()) {
            dados[topo] = valor;
            this.topo = this.topo + 1;
            System.out.println("OK - inserido");
        } else {
            System.out.println("ERROR - pilha ta cheia");
        }
    }

    public boolean cheia() {
        if (this.topo == this.tamanho) {
            return true;
        } else {
            return false;
        }
    }

    public boolean vazia() {
        if (this.topo == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void remove() {
        if (!this.vazia()) {
            this.topo = this.topo - 1;
            System.out.println("OK - removido");
        } else {
            System.out.println("ERROR - pilha ta vazia");
        }
    }

    public void imprime() {
        System.out.print("Pilha = ");
        for (int i = 0; i < this.topo; i++) {
            System.out.print(this.dados[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
