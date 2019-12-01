import java.util.Arrays;

public class Tablica {

    public static Produkt[] dodajProdukt(Produkt [] tablicaProduktow, Produkt nowyProdukt){

        int nowaDlugosc = tablicaProduktow.length+1;
        Produkt[] tempTablica = new Produkt[nowaDlugosc];

        for (int i = 0; i < tempTablica.length; i++) {
            if(i == tempTablica.length-1){
                tempTablica[i] = nowyProdukt;
            }else{
                tempTablica[i] = tablicaProduktow[i];
            }
        }
        return tempTablica;
    }


    public static void main(String[] args) {

        Produkt drzwi = new Produkt ("drzwi dęowe", 30);
        Produkt okno = new Produkt("okno dębowe", 10);

        Produkt[] produkty = {drzwi, okno};

        //wyświetl
        System.out.println(Arrays.toString(produkty));

        //dodaj
        System.out.println(produkty[1]);

        Produkt panel = new Produkt("Panel dębowy", 5);

        produkty = dodajProdukt(produkty, panel);

        System.out.println(Arrays.toString(produkty));

    }

}
