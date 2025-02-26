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
        }else{
            return false;
        }
    }

    public boolean vazia(){
        if (this.primeiro != -1 & this.ultimo != -1){
            return true;
        }else{
            return false;
        }
    }

    public void insere(int valor){
        if (!cheia()){
            if(vazia()){
                this.primeiro = 0;
            }
            this.ultimo = (this.ultimo + 1) % this.tamanho;
            this.dados[ultimo] = valor;
            System.out.println("OK - inserido");
        }else{
            System.out.println("ERROR - fila ta cheia");
        }
    }

    public void remove(){
        if (!vazia()){
            if(this.primeiro != this.ultimo){
                this.primeiro = (this.primeiro + 1) % this.tamanho;
            }else{
                this.primeiro = -1;
                this.ultimo = -1;
            }
            System.out.println("OK - removido");
        }else{
            System.out.println("ERROR - fila ta cheia");
        }
    }

    public void imprime(){
        System.out.print("Fila = ");
        int i = this.primeiro;
        while(i!=this.ultimo) {
            System.out.print(this.dados[i]);
            System.out.print(" ");
            i = (i + 1) % tamanho;
        }
        System.out.println();
    }
}
