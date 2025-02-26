public class main {
    public static void main(String[] args) {
        System.out.println("================ PILHA ================");
        pilha P = new pilha();
        P.insere(1);
        P.insere(2);
        P.insere(3);
        P.insere(4);
        P.insere(5);
        P.insere(6); // ERROR

        P.imprime();

        P.remove();
        P.remove();
        P.remove();
        P.remove();
        P.remove();
        P.remove(); // ERROR

        P.imprime();

        P.insere(10);
        P.insere(12);
        P.remove();
        P.insere(11);
        P.insere(12);
        P.insere(20);

        P.imprime();

        System.out.println("================ FILA ================");
        fila F = new fila();
        F.insere(1);
        F.insere(2);
        F.insere(3);
        F.insere(4);
        F.insere(5);
        F.insere(6); // ERROR

        F.imprime();

        F.remove();
        F.remove();
        F.remove();
        F.remove();
        F.remove();
        F.remove(); // ERROR

        F.imprime();

        F.insere(10);
        F.insere(12);
        F.remove();
        F.insere(11);
        F.insere(12);
        F.insere(20);

        F.imprime();
    }
}
