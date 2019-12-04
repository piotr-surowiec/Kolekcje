package Zadania.Zad3;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {

     public void dodajNaPolke(Ksiazka ksiazka, Polka polka){
        polka.getListaKsiazek().add(ksiazka);
    }

    public void wypiszZawartosc(Polka polka){
        List<Ksiazka> lista = polka.getListaKsiazek();
        System.out.println("Zawartość półki: " + polka.getNumerPolki());
        for(Ksiazka ksiazka: lista){
            System.out.println(ksiazka);
        }
    }

    public void zdejmijKsiazki(Polka polka, int indexOd, int indexDo){
         List<Ksiazka> lista = polka.getListaKsiazek();
         if(indexOd < lista.size() && indexDo <= lista.size() && indexOd < indexDo){
             List<Ksiazka> sublistKsiazek = lista.subList(indexOd, indexDo);
             lista.removeAll(sublistKsiazek);
         }else {
             System.out.println("Błędne wartości indexów.");
         }
    }

    public void oproznijPolke(Polka polka){
         polka.getListaKsiazek().clear();
    }

    public int liczbaPozycjiNaPolce(Polka polka){
         return polka.getListaKsiazek().size();
    }

    public int numerPozycjiNaPolce(Polka polka, Ksiazka ksiazka){
         return polka.getListaKsiazek().indexOf(ksiazka);
    }
}
