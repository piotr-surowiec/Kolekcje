package Wysyłka;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Poczta {

    public static final int PRODUKT_NIE_ISTNIEJE = -1;
    public static final int MINI_VAN_MAX_WAGA = 20;
    private final List<Produkt> produkty = new ArrayList<>();
    private List<Produkt> malyVanProdukty;
    private List<Produkt> duzyVanProdukty;

    public void dodajProdukt(Produkt produkt){
        produkty.add(produkt);
    }

    public void zamienProdukt(Produkt staryProdukt, Produkt nowyProdukt){
        int tempIndex = produkty.indexOf(staryProdukt);
        if (tempIndex != PRODUKT_NIE_ISTNIEJE){
//        produkty.remove(tempIndex);
//        produkty.add(tempIndex, nowyProdukt);
            produkty.set(tempIndex, nowyProdukt);
        }else {
            System.out.println("Tego produktu nie ma na liście !!!!!!!");
        }
    }

    public List<Produkt> getMalyVanProdukty() {
        return malyVanProdukty;
    }

    public List<Produkt> getDuzyVanProdukty() {
        return duzyVanProdukty;
    }

    public void przygotujPrzesylke(){
        //sortowanie względem wagi
        Collections.sort(produkty, Produkt.BY_WAGA); // użycie komparatora
        //znajdź index produktu, który jako pierwszy ma się znaleźć w dużym Vanie
        int index = znajdzIndexPodzialu();
        malyVanProdukty = produkty.subList(0, index); // idziemy od zera do index, ale bez indexu (exclusive)
        duzyVanProdukty = produkty.subList(index, produkty.size());
    }

    private int znajdzIndexPodzialu() {
        for (int i = 0; i < produkty.size(); i++) {
            if(produkty.get(i).getWaga() > MINI_VAN_MAX_WAGA){
                return i;
            }
        }
        return 0;
    }

    @Override
    public String toString(){
        return produkty.toString();
    }

}
