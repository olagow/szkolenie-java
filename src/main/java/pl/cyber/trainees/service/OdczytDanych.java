package pl.cyber.trainees.service;

import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class OdczytDanych {

    public String wprowadzonaWartoscZKlawiatury() {
        //Scanner -- obiekt pozwalający  na odczyt danych z klawiatury
        //System.in - obiekt reprezentujący InputStream, odpowiada za przetwarzanie danych
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();

    }

    // public String daneZPliku(File plikZew) throws FileNotFoundException
    //throws mówi aplikacji (ewentualnie) pojawiający
    // się błąd przenieść do miejsca wykonania metody


    //Obsłużenie wyjątków
    public String daneZPliku(File plikZew) throws FileNotFoundException
    {
        Scanner scan = new Scanner(plikZew);
        return scan.nextLine();
    }

    public Model daneOModeluPojazdu(File plikZew) throws FileNotFoundException
    {
//        Scanner scan = new Scanner(plikZew);
//        return scan.nextLine();
//    }
//
//        // string[] <-
//        //String[] <-

       
        //różnica między tablicą a Listą
        //lista.get(n)
        //tab[n]

        Model modelpojazdu = new Model(); //tworzy obiekt
        Scanner scan = new Scanner(plikZew);//skanuje, czyta z pliku
        String liniaWPliku = scan.nextLine();//
        String[] tablicaPliku = liniaWPliku.split(", ");

       // modelpojazdu.setMarka(tablicaPliku[0]);
        //modelpojazdu.setRocznik(tablicaPliku[1]);
        //modelpojazdu.setNaped(tablicaPliku[2]);
        //modelpojazdu.setNazwa(tablicaPliku[3]);
       // modelpojazdu.setPrzebieg(Integer.valueOf(tablicaPliku[4]));
       // modelpojazdu.setPojemnoscSilnika(Double.valueOf(tablicaPliku[5]));
       // modelpojazdu.setKolor(Kolor.valueOf(tablicaPliku[6]));

        return modelpojazdu;
    }
}
