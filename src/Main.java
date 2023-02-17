public class Main {
    public static void main(String[] args) {
        /*
         * creare una applicazione java che contiene una classe ContiCorrente,
         * una classe Movimenti ed una classe con il main. ogni conto corrente
         * deve avere gli attributi iban, saldo ed una lista di movimenti. ogni
         * movimento deve avere gli attributi data (classe Calendar),importo,causale e un booleano
         * che indica se è una entrata o una uscita. implementare i metodi preleva()
         * e versa() nel conto corrente. Implementare nella classe ContiCorrente un metodo
         * inserisciBonifico(ContiCorrente destinatario). Nelle classi ContiCorrente e Movimenti fare l'override
         * dei metodi equals e toString. Nel metodo equals del conto corrente tenere conto dell'iban,
         * cioè due conti corrente sono uguali se hanno lo stesso iban. Creare un metodo main per
         * testare il programma, in particolare creare due conti corrente di
         * prova ed effettuare varie operazioni di versamento, prelievo e bonifici vari.
         */
        ContiCorrente cC0 = new ContiCorrente("IT38912731982737", 2000);
        ContiCorrente cc1 = new ContiCorrente("IT12312334234235", 3500);

        cc1.preleva(350);
        cc1.versa(350);
        cc1.inserisciBonifico(cC0, 1000);
        System.out.println("Saldo " + cC0);
        System.out.println("Saldo " + cc1);
    }
}