package Model;

/**
 *
 * @author Acer
 */
public class Pizza {
    
    String navn;
    String indhold;
    double pris;
    int nummer;

    public Pizza(int nummer, String navn, double pris, String indhold) {
        this.nummer = nummer;
        this.navn = navn;
        this.pris = pris;
        this.indhold = indhold;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getIndhold() {
        return indhold;
    }

    public void setIndhold(String indhold) {
        this.indhold = indhold;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String toString() {
        return String.format("%d. %s: %s %.2f kr", nummer, navn, indhold, pris);
    }
}
