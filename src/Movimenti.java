import java.util.Calendar;

public class Movimenti {
    private Calendar data;
    private double importo;
    private String causale;
    private boolean entrata;

    public Movimenti(Calendar data, double importo, String casuale, boolean entrata) {
        this.data = data;
        this.importo = importo;
        this.causale = casuale;
        this.entrata = entrata;
    }

    public Calendar getData() {
        return data;
    }


    public double getImporto() {
        return importo;
    }


    public String getCasuale() {
        return causale;
    }


    public boolean isEntrata() {
        return entrata;
    }

    @Override
    public String toString() {
        return "Movimenti{" +
                "data=" + data +
                ", importo=" + importo +
                ", causale='" + causale + '\'' +
                ", entrata=" + entrata +
                '}';
    }
}
