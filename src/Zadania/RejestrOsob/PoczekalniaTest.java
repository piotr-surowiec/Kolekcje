package Zadania.RejestrOsob;

import java.util.ArrayList;

public class PoczekalniaTest {

    Osoba jan = new Osoba(34, "Kowalski");
    Osoba janek = new Osoba(33, "Nowak");
    Osoba bartek = new Osoba(31, "Bogacki");
    Osoba lukasz = new Osoba(28, "Kowalczyk");
    Osoba kasia = new Osoba(20, "Nosowska");
    Osoba iwona = new Osoba(21, "Wojtyra");

    RejestrOsob rejestr1 = new RejestrOsob(new ArrayList<Osoba>());

//    RejestrOsob rejestr2 = new RejestrOsob(new ArrayList<Osoba>() {
//        {
//            add(lukasz);
//            add(kasia);
//            add(iwona);
//        }
//    }
//    );

    Poczekalnia poczekalnia = new Poczekalnia();

    public void dodajOsobe(){
        System.out.println("I test: ");
        poczekalnia.dodajOsobe(rejestr1, jan);
        poczekalnia.dodajOsobe(rejestr1, janek);
        poczekalnia.dodajOsobe(rejestr1, bartek);
        System.out.println(rejestr1);
    }

    public void usunOsobe(){
        System.out.println("II test: ");
        poczekalnia.usunOsobe(rejestr1, janek);
        System.out.println(rejestr1);
    }

    public void wypiszRejestr(){
        System.out.println("III test: ");
        poczekalnia.wypiszListeOsob(rejestr1);
    }

    public void znajdzOsobe(){
        System.out.println("IV test: ");
        poczekalnia.znajdzOsobe(rejestr1, "Bogacki");
    }

    public void avg(){
        System.out.println("V test: ");
        System.out.println("Sredni wiek osób w rejestrze wynosi: " + poczekalnia.sredniWiekOsobWRejestrze(rejestr1) + " lat.");
    }

    public void min(){
        System.out.println("VI test: ");
        System.out.println("Najmłodsza osoba ma: " + poczekalnia.najmlodszaOsoba(rejestr1).getWiek() + " lat.");
    }

    public void max(){
        System.out.println("VII test: ");
        System.out.println("Najstarsza osoba ma: " + poczekalnia.najstarszaOsoba(rejestr1).getWiek() + " lat.");
    }

    public static void main(String[] args) {

        PoczekalniaTest poczekalniaTest = new PoczekalniaTest();

        poczekalniaTest.dodajOsobe();
        poczekalniaTest.usunOsobe();
        poczekalniaTest.wypiszRejestr();
        poczekalniaTest.znajdzOsobe();
        poczekalniaTest.avg();
        poczekalniaTest.min();
        poczekalniaTest.max();

    }
}
