package Wysyłka;

public class PocztaTest {

    Produkt drzwi = new Produkt("drzwi dębowe", 30);
    Produkt okno = new Produkt("okno dębowe", 10);
    Produkt panel = new Produkt("panel dębowy", 5);
    Produkt brama = new Produkt("brama wjazdowa", 100);

    private Poczta poczta = new Poczta();
    private Poczta pocztaVany = new Poczta();

    public void dodanieProduktu(){
        poczta.dodajProdukt(drzwi);
        poczta.dodajProdukt(okno);
        System.out.println("I test: \n" + poczta);
    }

    public void zamianaProduktow(){
        poczta.zamienProdukt(drzwi, panel);
        System.out.println("II test: \n" + poczta);
    }

    public void zamianaNieIstniejacegoProduktu(){
        poczta.zamienProdukt(brama, panel);
        System.out.println("III test: \n" + poczta +'\n');
    }

    public void podzialNaVany(){
        pocztaVany.dodajProdukt(drzwi);
        pocztaVany.dodajProdukt(okno);
        pocztaVany.dodajProdukt(panel);
        pocztaVany.dodajProdukt(brama);

        pocztaVany.przygotujPrzesylke();
        System.out.println("IV test: \n" + "Produkty w małym Vanie: " + pocztaVany.getMalyVanProdukty() + "\nProdukty w dużym Vanie: " + pocztaVany.getDuzyVanProdukty());
    }

    public static void main(String[] args) {

        PocztaTest pocztaTest = new PocztaTest();
        pocztaTest.dodanieProduktu();
        pocztaTest.zamianaProduktow();
        pocztaTest.zamianaNieIstniejacegoProduktu();

        PocztaTest pocztaTestVany = new PocztaTest();
        pocztaTestVany.podzialNaVany();
    }

}
