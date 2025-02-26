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

    public int distancia(){
        int distancia = 1;
        int i = this.primeiro;
        while(i!=this.ultimo) {
            i = (i + 1) % this.tamanho;
            distancia = distancia + 1;
        }
        return distancia;
    }

    public boolean cheia(){
        if(this.primeiro != -1 & this.ultimo != -1){
            if (this.distancia() == this.tamanho){
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
        if (this.primeiro == -1 & this.ultimo == -1){
            return true;
        }else{
            return false;
        }
    }

    public void insere(int valor){
        if (!this.cheia()){
            if(this.vazia()){
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
        if (!this.vazia()){
            if(this.primeiro != this.ultimo){
                this.primeiro = (this.primeiro + 1) % this.tamanho;
            }else{
                this.primeiro = -1;
                this.ultimo = -1;
            }
            System.out.println("OK - removido");
        }else{
            System.out.println("ERROR - fila ta vazia");
        }
    }

    public void imprime(){
        System.out.print("Fila = ");
        int i = this.primeiro;
        if (this.){

        }
        System.out.print(this.dados[i]);
        System.out.print(" ");

        while(i!=this.ultimo) {
            i = (i + 1) % this.tamanho;
            System.out.print(this.dados[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
