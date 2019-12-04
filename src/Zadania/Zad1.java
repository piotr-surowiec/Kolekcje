package Zadania;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Zad1 {

    public static int PUSTA_LISTA = 1;

    public static void main(String[] args) {

        int index = 0;
        System.out.println("Podaj kilka liczb:");
        List<Integer> listaLiczb = new ArrayList<>();

        Scanner skaner = new Scanner(System.in);
        String[] wczytaneWartosci = skaner.nextLine().split("\\s+");
        if (wczytaneWartosci.length == PUSTA_LISTA && wczytaneWartosci[0].equals("")) {
            System.out.println("Lista jest pusta !!!");
        } else {
            for (int i = 0; i < wczytaneWartosci.length; i++) {
                listaLiczb.add(Integer.parseInt(wczytaneWartosci[i]));
            }
            Collections.sort(listaLiczb);

            for (int i = 0; i < listaLiczb.size(); i++) {
                if (listaLiczb.get(i) > 0) {
                    index = i;
                    break;
                }
            }

            List<Integer> liczbyDodatnie = listaLiczb.subList(index, listaLiczb.size());
            List<Integer> liczbyUjemne = listaLiczb.subList(0, index);

            System.out.println("Liczb dodatnich elementów w liście jest: " + liczbyDodatnie.size());
            System.out.println("Liczb ujemnych elementów w liście jest: " + liczbyUjemne.size());

            int sumaDodatnich = 0, sumaUjemnych = 0, sumaCalkowita = 0;

            for (int i = 0; i < liczbyDodatnie.size(); i++) {
                sumaDodatnich += liczbyDodatnie.get(i);
            }
            for (int i = 0; i < liczbyUjemne.size(); i++) {
                sumaUjemnych += liczbyUjemne.get(i);
            }
            for (int i = 0; i < listaLiczb.size(); i++) {
                sumaCalkowita += listaLiczb.get(i);
            }

            System.out.println("Suma liczb dodatnich: " + sumaDodatnich);
            System.out.println("Suma liczb ujemnych: " + sumaUjemnych);
            System.out.println("Suma całkowita: " + sumaCalkowita);
        }
    }
}
