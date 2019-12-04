package Zadania.RejestrOsob;

import java.util.Collections;
import java.util.Iterator;

public class Poczekalnia {

    public void dodajOsobe(RejestrOsob rejestr, Osoba osoba) {
        rejestr.getOsoby().add(osoba);
    }

    public void usunOsobe(RejestrOsob rejestr, Osoba osoba) {
        rejestr.getOsoby().remove(osoba);
    }

    public void wypiszListeOsob(RejestrOsob rejestr) {
        Iterator<Osoba> iteratorOsob = rejestr.getOsoby().iterator();
        while (iteratorOsob.hasNext()) {
            System.out.println(iteratorOsob.next());
        }
    }

    public Osoba znajdzOsobe(RejestrOsob rejestr, String nazwisko) {
        Osoba osobaZnaleziona = new Osoba();
        int licznik = 0;
        for (Osoba osoba : rejestr.getOsoby()) {
            if (osoba.getNazwisko() == nazwisko) {
                System.out.println("Znaleziono osobe o podanym nazwisku: " + osoba);
                osobaZnaleziona = osoba;
            } else {
                licznik++;
            }
            if(licznik == rejestr.getOsoby().size()){
                System.out.println("Nie znaleziono osoby o podanym nazwisku.");
            }
        };
        return osobaZnaleziona;
    }

    public double sredniWiekOsobWRejestrze(RejestrOsob rejest) {
        double wiekSumaryczny = 0.0;
        double sredniWiek = 0.0;
        if (rejest.getOsoby().size() != 0) {
            for (Osoba osoba : rejest.getOsoby()) {
                wiekSumaryczny += osoba.getWiek();
            }
            sredniWiek = wiekSumaryczny / (double) rejest.getOsoby().size();
            return sredniWiek;
        }else{
            System.out.println("Rejestr pusty");
            return sredniWiek;
        }
    }

    public Osoba najmlodszaOsoba(RejestrOsob rejestr){
//        Collections.sort(rejestr.getOsoby(), Osoba.BY_WIEK);
//        Osoba najmlodszaOsoba = new Osoba();
//        Osoba osobaTemp = new Osoba(0, "temp");
//        for(Osoba osoba: rejestr.getOsoby()){
//            if(osoba.getWiek() < osobaTemp.getWiek()){
//                najmlodszaOsoba = osoba;
//            }else{
//                osobaTemp = osoba;
//            }
//        }
        return Collections.min(rejestr.getOsoby(), Osoba.BY_WIEK);
    }

    public Osoba najstarszaOsoba(RejestrOsob rejestr){
        return Collections.max(rejestr.getOsoby(), Osoba.BY_WIEK);
    }

}
