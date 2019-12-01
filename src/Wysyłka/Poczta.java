package Wysyłka;

import java.util.ArrayList;
import java.util.List;

public class Poczta {

    public static final int PRODUKT_NIE_ISTNIEJE = -1;
    private final List<Produkt> produkty = new ArrayList<>();

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

    @Override
    public String toString(){
        return produkty.toString();
    }

}
