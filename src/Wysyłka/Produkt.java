package Wysyłka;

import java.util.Objects;

public class Produkt {

    private String nazwa;
    private int waga;

    public Produkt(String nazwa, int waga) {
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
        return Objects.hash(nazwa, waga);
    }

    @Override
    public String toString() {
        return "Produkt o nazwie: " + nazwa + " waży: " + waga + " kg.";
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }
}
