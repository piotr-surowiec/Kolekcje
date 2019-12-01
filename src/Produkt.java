import java.util.Objects;

public class Produkt {

    private final int waga;
    private final String nazwa;

    public Produkt(String nazwa, int waga){
        this.nazwa = nazwa;
        this.waga = waga;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return waga == produkt.waga &&
                nazwa.equals(produkt.nazwa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(waga, nazwa);
    }

    @Override
    public String toString() {
        return "Produkt o nazwie: " + nazwa + " waży: " + waga + " kg.";
    }

    public int getWaga() {
        return waga;
    }

    public String getNazwa() {
        return nazwa;
    }

}
