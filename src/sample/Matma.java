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

        for (String wartos : dane) {
            if (wartos.equals("/")) {
                int obliczanie = dane.indexOf(wartos);
                float pierliczba = Float.parseFloat(dane.get(obliczanie - 1));
                float drugaLiczba = Float.parseFloat(dane.get(obliczanie + 1));
                wynik = pierliczba / drugaLiczba;
                dane.set(obliczanie, wynik.toString());
                dane.remove(obliczanie + 1);
                dane.remove(obliczanie - 1);
            }
        }

        for (String wartos : dane) {
            if (wartos.equals("*")) {
                int obliczanie = dane.indexOf(wartos);
                float pierliczba = Float.parseFloat(dane.get(obliczanie - 1));
                float drugaLiczba = Float.parseFloat(dane.get(obliczanie + 1));
                wynik = pierliczba * drugaLiczba;
                dane.set(obliczanie, wynik.toString());
                dane.remove(obliczanie + 1);
                dane.remove(obliczanie - 1);
            }
        }
        for (String wartos : dane) {
            if (wartos.equals("+")) {
                int obliczanie = dane.indexOf(wartos);
                float pierliczba = Float.parseFloat(dane.get(obliczanie - 1));
                float drugaLiczba = Float.parseFloat(dane.get(obliczanie + 1));
                wynik = pierliczba + drugaLiczba;
                dane.set(obliczanie, wynik.toString());
                dane.remove(obliczanie + 1);
                dane.remove(obliczanie - 1);
            }
        }
        for (String wartos : dane) {
            if (wartos.equals("-")) {
                int obliczanie = dane.indexOf(wartos);
                float pierliczba = Float.parseFloat(dane.get(obliczanie - 1));
                float drugaLiczba = Float.parseFloat(dane.get(obliczanie + 1));
                wynik = pierliczba - drugaLiczba;
                dane.set(obliczanie, wynik.toString());
                dane.remove(obliczanie + 1);
                dane.remove(obliczanie - 1);
            }
        }
        return Float.toString(wynik);
    }
}




