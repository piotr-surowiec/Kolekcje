package Zadania.Zad3;

import java.util.Objects;

public class Ksiazka {

    private String autor, tytul;

    public Ksiazka(String autor, String tytul) {
        this.autor = autor;
        this.tytul = tytul;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "autor='" + autor + '\'' +
                ", tytul='" + tytul + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ksiazka ksiazka = (Ksiazka) o;
        return autor.equals(ksiazka.autor) &&
                tytul.equals(ksiazka.tytul);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autor, tytul);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }
}
