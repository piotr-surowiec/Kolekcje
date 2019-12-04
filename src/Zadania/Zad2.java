package Zadania;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Zad2 {

    public static void main(String[] args) {

        List<Integer> listLinked = new LinkedList<>();
        Random random = new Random();
        do{
            listLinked.add(listLinked.size()/2, random.nextInt(100));
            System.out.println(listLinked);
        }while (listLinked.size() < 20);

    }
}
