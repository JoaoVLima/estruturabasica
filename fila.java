public class fila {
    public int tamanho;
    public int[] dados;
    public int primeiro;
    public int ultimo;

    public fila(){
        this.tamanho = 5;
        this.dados = new int[this.tamanho];
        this.primeiro = -1;
        this.ultimo = -1;
    }

    public boolean cheia(){
        if(this.primeiro != -1 & this.ultimo != -1){
            if (this.primeiro == this.ultimo){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public boolean vazia(){

    }

    public void insere(){

    }

    public void remove(){

    }

    public void imprime(){

    }
}
