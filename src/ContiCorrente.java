import java.util.ArrayList;
import java.util.Calendar;

public class ContiCorrente {
    //attributi iban, saldo ed una lista di movimenti
    private String iban;
    private double saldo;
    ArrayList<Movimenti> listamovimenti= new ArrayList<>();

    public ContiCorrente(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
        this.listamovimenti=new ArrayList<>();
    }

    public String getIban() {
        return iban;
    }


    public double getSaldo() {
        return saldo;
    }


    public void preleva(double importo){
        if (saldo>=importo){
            saldo=saldo-importo;
            Movimenti movimenti = new Movimenti(Calendar.getInstance(), importo,"Preleva", false);
            listamovimenti.add(movimenti);
        }

    }

    public void versa( double importo){
        saldo=saldo+importo;
        Movimenti movimenti = new Movimenti(Calendar.getInstance(), importo, "Versa",true);
        listamovimenti.add(movimenti);


    }
    public void inserisciBonifico(ContiCorrente destinatario, double importo){
        preleva(importo);
        destinatario.versa(importo);
        Movimenti movimenti = new Movimenti(Calendar.getInstance(), importo, "Bonifico", false);
        listamovimenti.add(movimenti);


    }

    @Override
    public String toString() {
        return "ContiCorrente{" +
                "iban='" + iban + '\'' +
                ", saldo=" + saldo +
                ", listamovimenti=" + listamovimenti +
                '}';
    }
}
