public class fila {
    public int MAX;
    public int[] dados;
    public int inicio;
    public int fim;

    public fila(){
        this.MAX = 5+1;
        this.dados = new int[this.MAX];
        this.inicio = 0;
        this.fim = 0;
    }

    public boolean cheia(){
        return ((this.fim + 1) % this.MAX == this.inicio);
    }

    public boolean vazia(){
        return (this.inicio == this.fim);
    }

    public void insere(int elemento){
        if (this.cheia()) {
            System.out.println("ERROR - fila ta cheia");
            return;
        }
        this.dados[this.fim] = elemento;
        this.fim = (this.fim + 1) % this.MAX;
        System.out.println("OK - inserido");
    }

    public Integer remove(){
        if (this.vazia()){
            System.out.println("ERROR - fila ta vazia");
            return null;
        }
        int elemento = this.dados[this.inicio];
        this.inicio = (this.inicio + 1) % this.MAX;
        System.out.println("OK - removido");
        return elemento;
    }

    public void imprime(){
        System.out.print("Fila = ");
        int i = this.inicio;
        if (!this.vazia()) {
            System.out.print(this.dados[i]);
            System.out.print(" ");

            while (i != this.fim-1) {
                i = (i + 1) % this.MAX;
                System.out.print(this.dados[i]);
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
