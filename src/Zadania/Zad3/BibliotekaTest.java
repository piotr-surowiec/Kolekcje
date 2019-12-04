package Zadania.Zad3;

public class BibliotekaTest {

    Ksiazka wPustyniIWPuszczy = new Ksiazka("Henryk Sienkiweicz", "W pustyni i w puszczy");
    Ksiazka harryPotter = new Ksiazka("J.R.R Rowling", "Harry Potter");
    Ksiazka panTadeusz = new Ksiazka("Henryk Sienkiewicz", "Pan Tadeusz");
    Ksiazka ogniemIMieczem = new Ksiazka("Henryk Sienkiewicz", "Ogniem i Mieczem");
    Ksiazka panWolodyjowski = new Ksiazka("Henryk Sienkiewicz", "Pan Wolodyjowski");
    Ksiazka mojaKSiazka = new Ksiazka("Karolia Rudzka", "Ja");

    Polka Polka1 = new Polka(1);
    Polka Polka2 = new Polka(2);
    Polka Polka3 = new Polka(3);
    Polka Polka4 = new Polka(4);

    private Biblioteka biblioteka = new Biblioteka();

    public void dodanieNaPolke(){
        biblioteka.dodajNaPolke(wPustyniIWPuszczy, Polka1);
        biblioteka.dodajNaPolke(harryPotter, Polka2);
        biblioteka.dodajNaPolke(panTadeusz, Polka3);
        biblioteka.dodajNaPolke(ogniemIMieczem, Polka1);
        biblioteka.dodajNaPolke(panWolodyjowski,Polka1);
        biblioteka.dodajNaPolke(mojaKSiazka, Polka4);

        System.out.println("I test: " + "\n" + Polka1.getNumerPolki() + " " + Polka1.getListaKsiazek() + "\n" +
                Polka2.getNumerPolki() + " " + Polka2.getListaKsiazek() + "\n" +
                Polka3.getNumerPolki() + " " + Polka3.getListaKsiazek() + "\n" +
                Polka4.getNumerPolki() + " " + Polka4.getListaKsiazek() + "\n");

    }

    public void wypiszZawartosc(){
        System.out.println("II test: " + '\n');
        biblioteka.wypiszZawartosc(Polka1);
    }

    public void zdejmijKsiazki(){
        System.out.println("III test: pre" + Polka1.getListaKsiazek());
        biblioteka.zdejmijKsiazki(Polka1, 1,2);
        System.out.println("III test: post" + Polka1.getListaKsiazek());
    }

    public void oproznijPolke(){
        System.out.println("\n----------------------------\nIV test pre:");
        biblioteka.wypiszZawartosc(Polka4);
        biblioteka.oproznijPolke(Polka4);
        System.out.println("IV test post: \n");
        biblioteka.wypiszZawartosc(Polka4);
    }

    public void liczbaPozycjiNaPolce(){
        System.out.println("V test:");
        biblioteka.wypiszZawartosc(Polka1);
        System.out.println("Ilość książek na półce: " + biblioteka.liczbaPozycjiNaPolce(Polka1));

    }

    public void nrPozycjiNaPolce(){
        System.out.println("VI test:");
        System.out.println("Numer pozycji na półce: " + biblioteka.numerPozycjiNaPolce(Polka1, panWolodyjowski));
    }

    public static void main(String[] args) {

        BibliotekaTest bibliotekaTest = new BibliotekaTest();

        bibliotekaTest.dodanieNaPolke();
        bibliotekaTest.wypiszZawartosc();
        bibliotekaTest.zdejmijKsiazki();
        bibliotekaTest.oproznijPolke();
        bibliotekaTest.liczbaPozycjiNaPolce();
        bibliotekaTest.nrPozycjiNaPolce();
    }


}
