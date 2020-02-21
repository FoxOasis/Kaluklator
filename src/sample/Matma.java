package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Matma {
    Float wynik;
    List<String> dane = new CopyOnWriteArrayList<>();


    public void addDane(String wartosc) {
        dane.add(wartosc);
    }


    public String oblicz() {
//tu musze ogarnac dzialania i operacje na liscie i wypluc go jako string lub int (jesli int to wtedy w metodzie wywolanej w cotrolerze musze zmienic w Stringa)
        for (String wartos : dane) {
            if (wartos.equals("/")) {
                int obliczanie = dane.indexOf(wartos);
                float pierliczba = Float.parseFloat(dane.get(obliczanie - 1));
                float drugaLiczba = Float.parseFloat(dane.get(obliczanie + 1));
                wynik = pierliczba / drugaLiczba;
                System.out.println(pierliczba);
                System.out.println(drugaLiczba);
                System.out.println("index " +dane.indexOf(wartos));
                System.out.println("dana wartosc "+wartos);
                System.out.println("obliczanie "+obliczanie);
                System.out.println("wielkosc tablicy "+dane.size());
                dane.set(obliczanie, wynik.toString());
                dane.remove(obliczanie+1);
                System.out.println("wielkosc tablicy "+dane.size());
                dane.remove(obliczanie-1);
                System.out.println("wielkosc1 "+dane.size());
            }
        }
//        for( String wartos : dane){
//            System.out.println(" sprawdzenie" +wartos);
//            System.out.println("wielkosc tablicy :"+dane.size());
//        }

       for (String wartos : dane) {
            if (wartos.equals("*")) {
                int obliczanie = dane.indexOf(wartos);
                float pierliczba = Float.parseFloat(dane.get(obliczanie - 1));
                float drugaLiczba = Float.parseFloat(dane.get(obliczanie + 1));
                wynik = pierliczba * drugaLiczba;
                System.out.println(pierliczba);
                System.out.println(drugaLiczba);
                System.out.println("index " +dane.indexOf(wartos));
                System.out.println("dana wartosc "+wartos);
                System.out.println("obliczanie "+obliczanie);
                System.out.println("wielkosc tablicy "+dane.size());
                dane.set(obliczanie, wynik.toString());
                dane.remove(obliczanie+1);
                System.out.println("wielkosc tablicy "+dane.size());
                dane.remove(obliczanie-1);
                System.out.println("wielkosc1 "+dane.size());
            }
        }
        for (String wartos : dane) {
            if (wartos.equals("+")) {
                int obliczanie = dane.indexOf(wartos);
                float pierliczba = Float.parseFloat(dane.get(obliczanie - 1));
                float drugaLiczba = Float.parseFloat(dane.get(obliczanie + 1));
                wynik = pierliczba + drugaLiczba;
                System.out.println(pierliczba);
                System.out.println(drugaLiczba);
                System.out.println("index " +dane.indexOf(wartos));
                System.out.println("dana wartosc "+wartos);
                System.out.println("obliczanie "+obliczanie);
                System.out.println("wielkosc tablicy "+dane.size());
                dane.set(obliczanie, wynik.toString());
                dane.remove(obliczanie+1);
                System.out.println("wielkosc tablicy "+dane.size());
                dane.remove(obliczanie-1);
                System.out.println("wielkosc1 "+dane.size());
            }
        }
        for (String wartos : dane) {
            if (wartos.equals("-")) {
                int obliczanie = dane.indexOf(wartos);
                float pierliczba = Float.parseFloat(dane.get(obliczanie - 1));
                float drugaLiczba = Float.parseFloat(dane.get(obliczanie + 1));
                wynik = pierliczba - drugaLiczba;
                System.out.println(pierliczba);
                System.out.println(drugaLiczba);
                System.out.println("index " +dane.indexOf(wartos));
                System.out.println("dana wartosc "+wartos);
                System.out.println("obliczanie "+obliczanie);
                System.out.println("wielkosc tablicy "+dane.size());
                dane.set(obliczanie, wynik.toString());
                dane.remove(obliczanie+1);
                System.out.println("wielkosc tablicy "+dane.size());
                dane.remove(obliczanie-1);
                System.out.println("wielkosc1 "+dane.size());
            }
        }


        return Float.toString(wynik);
    }}




