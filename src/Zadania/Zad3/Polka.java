package Zadania.Zad3;

import java.util.ArrayList;
import java.util.Objects;

public class Polka {

    private ArrayList<Ksiazka> listaKsiazek;
    private int numerPolki;

    public Polka(int numerPolki) {
        this.numerPolki = numerPolki;
        this.listaKsiazek = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polka polka = (Polka) o;
        return numerPolki == polka.numerPolki &&
                Objects.equals(listaKsiazek, polka.listaKsiazek);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listaKsiazek, numerPolki);
    }

    @Override
    public String toString() {
        return "Polka{" +
                "listaKsiazek=" + listaKsiazek +
                ", numerPolki=" + numerPolki +
                '}';
    }

    public ArrayList<Ksiazka> getListaKsiazek() {
        return listaKsiazek;
    }

    public int getNumerPolki() {
        return numerPolki;
    }
}
