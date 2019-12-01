package Wysyłka;

import java.util.ArrayList;
import java.util.List;

public class Poczta {

    private final List<Produkt> produkty = new ArrayList<>();

    public void dodajProdukt(Produkt produkt){
        produkty.add(produkt);
    }
}
