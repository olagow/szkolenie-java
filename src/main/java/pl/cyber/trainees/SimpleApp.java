package pl.cyber.trainees;

import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;

public class SimpleApp {


    public static void main(String[] args) {


        Model modelPojazdu1 = new Model ();
        var modelPojazdu2 = new Model ("VW", "2020", "przod", "Passat",
    10000, 2.0,"NIEBIESKI");

        var modelPojazdu3 = new Model ("VM", "2000", "przod", "Passat",
            300000, 2.0, Kolor.valueOf ("NIEBIESKI");

        System.out.println(modelPojazdu2.toString());
        System.out.println(modelPojazdu2.getMarka());
        System.out.println(modelPojazdu2.getNaped());
        System.out.println(modelPojazdu2.getNazwa());


}




