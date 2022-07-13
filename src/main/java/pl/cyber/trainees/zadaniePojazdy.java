package pl.cyber.trainees;

import groovy.lang.GString;
import pl.cyber.trainees.dziedziczenie.Model;
import pl.cyber.trainees.service.OdczytDanych;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;

public class zadaniePojazdy {

    public static void main(String[] args) throws FileNotFoundException {

        OdczytDanych odczytd = new OdczytDanych();
        Model samochod1 = odczytd.daneOModeluPojazdu(new File("C:\\Users\\Dell\\IdeaProjects\\szkolenie-java\\src\\main\\resources\\samochody.podkatalog\\samochod1.txt"));
        Model samochod2 = odczytd.daneOModeluPojazdu(new File("C:\\Users\\Dell\\IdeaProjects\\szkolenie-java\\src\\main\\resources\\samochody.podkatalog\\samochod2.txt"));
        Model samochod3 = odczytd.daneOModeluPojazdu(new File("C:\\Users\\Dell\\IdeaProjects\\szkolenie-java\\src\\main\\resources\\samochody.podkatalog\\samochod3.txt"));

       Integer sumaPrzebiegu;
       sumaPrzebiegu = samochod1.getPrzebieg() + samochod2.getPrzebieg() + samochod3.getPrzebieg();
       System.out.println("Suma przebiegu: " + sumaPrzebiegu);

       System.out.println("dostępne pojemności silnikow " + samochod1.getPojemnoscSilnika() + " " + samochod2.getPojemnoscSilnika() +
               " " + samochod3.getPojemnoscSilnika());

        System.out.println("Pojazd nr 1: " + samochod1.toString());
        System.out.println("Pojazd nr 2: " + samochod2.toString());
        System.out.println("Pojazd nr 3: " + samochod3.toString());




    }


}





