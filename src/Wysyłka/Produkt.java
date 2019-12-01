package Wysyłka;

public class Produkt {

    private String nazwa;
    private int waga;

    public Produkt(String nazwa, int waga) {
        this.nazwa = nazwa;
        this.waga = waga;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", waga=" + waga +
                '}';
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
