import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Kolekcja {

    public static void main(String[] args) {
        Produkt drzwi = new Produkt("drzwi dęowe", 30);
        Produkt okno = new Produkt("okno dębowe", 10);
        Produkt panel = new Produkt("Panel dębowy", 5);
        Produkt brama = new Produkt("brama wjazdowa", 100);

        Collection<Produkt> produkty = new ArrayList<>();
        produkty.add(drzwi);
        produkty.add(okno);
        produkty.add(panel);
        produkty.add(brama);

        System.out.println(produkty);
        System.out.println("----------------------------------------------------------");

        final Iterator<Produkt> iterator = produkty.iterator();

        while (iterator.hasNext()){
            Produkt produkt = iterator.next();
            if (produkt.getWaga() > 20){
                System.out.println(produkt);
            }else{
                iterator.remove();
            }
        }
        System.out.println("Wynik while'a : " + produkty);

//        for(Produkt produkt: produkty){
//            if(produkt.getWaga() > 20){
//                System.out.println(produkt);
//            }else{
//                produkty.remove(produkt);
//            }
//        }
//        System.out.println("Wynik foreach'a : " + produkty);

        System.out.println("Rozmiar kolekcji: " + produkty.size());
        System.out.println("Czy kolekcja jest pusta: " + produkty.isEmpty());
        System.out.println(produkty.contains(panel));
        System.out.println(produkty.remove(brama));
        System.out.println(produkty);
        System.out.println("-----------------------------------------------");

        List<Produkt> listaPomocnicza = new ArrayList<>(0);
        listaPomocnicza.add(drzwi);
        listaPomocnicza.add(okno);

        produkty.addAll(listaPomocnicza);

        System.out.println("Produkty po dodaniu listy pomocniczej: \n" + produkty);
        produkty.removeAll(listaPomocnicza);
        System.out.println("Produkty po usunięciu: \n" + produkty + " Pusta tablica, ponieważ takie same drzwi były dwa razy mimo, że wcześniej już były drzwi");

    }

}
