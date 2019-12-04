package Zadania.RejestrOsob;

import Wysyłka.Produkt;

import java.util.Comparator;
import java.util.Objects;

public class Osoba {

    private int wiek;
    private String nazwisko;

    public Osoba(){}

    public Osoba(int wiek, String nazwisko) {
        this.wiek = wiek;
        this.nazwisko = nazwisko;
    }

    public static final Comparator<Osoba> BY_WIEK =
            new Comparator<Osoba>() {
                @Override
                public int compare(Osoba o1, Osoba o2) {
                    return Integer.compare(o1.getWiek(), o2.getWiek());
                }
            };

    @Override
    public String toString() {
        return nazwisko + " ma " + wiek + " lat.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return wiek == osoba.wiek &&
                nazwisko.equals(osoba.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wiek, nazwisko);
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
