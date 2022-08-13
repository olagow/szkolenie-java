package pl.cyber.trainees.wyjasnienia;

import pl.cyber.trainees.wyjasnienia.Wyjatek.MojPierwszyException;
import pl.cyber.trainees.wyjasnienia.zwierzeta.Kot;
import pl.cyber.trainees.wyjasnienia.zwierzeta.Pies;
import pl.cyber.trainees.wyjasnienia.zwierzeta.Zwierzę;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Obiekty {


    public void uruchom() {
        //    zadanie1();
        //    zadanie2();
        //    zadanie3();
        //   zadanie4();
            zadanie5();

    }


    private void wyswietlTalkDTO() {
        List<String> list = new ArrayList<>();
        list.add("przyklad1");

        TalkDTO talkDTO = new TalkDTO("Obiektowosc", "Operacje na obiektach", list);
        //System.out.println(talkDTO.toString());
        //System.out.println("Dziś zajmujemy się tematem: " + talkDTO.getTematRozmowy());

        System.out.println(talkDTO.getTematRozmowy());
        System.out.println(talkDTO.opis);

        talkDTO.opis = "";

        System.out.println(talkDTO.getTematRozmowy());
        System.out.println(talkDTO.getOpis());

        talkDTO.setOpis("1234555");

        System.out.println(talkDTO.getTematRozmowy());
        System.out.println(talkDTO.getOpis());

        System.out.println(talkDTO.getPrzyklady());

        //dodawanie do paramentrow listy wersja 1
        List<String> wiecej = new ArrayList<>();
        wiecej.add("przyklad2");
        wiecej.add("przyklad3");

        talkDTO.modifyList((wiecej));


        //dodawanie do paramentrow listy wersja 2

        System.out.println(talkDTO.getPrzyklady());
        //talkDTO.setPrzyklady(wiecej);//?

        List<String> wiecej2 = new ArrayList<>();
        // wiecej2.addAll(talkDTO.getPrzyklady()): //talkDTO.getPrzyklad() [przyklad1]
        wiecej2.addAll(talkDTO.getPrzyklady());
        wiecej2.add("przyklady4");


        talkDTO.setPrzyklady(wiecej2);
        System.out.println(talkDTO.getPrzyklady());

        //dodawanie do parametru listy nowych wartosci ver 3
        //TalkDTO talkDTO = new TalkDTO("Obiektowosc", "Operacje na obiektach", list);

        talkDTO = new TalkDTO(talkDTO.getTematRozmowy(), talkDTO.getOpis(), wiecej2);   //definiowej nowej wartosci dla istniejacej zmiennej

        System.out.println(talkDTO.getPrzyklady());


          /*
            Utwórz klasę Kot . Klasa ta powinna mieć następujące pola:

              imię (ciąg znaków)
              data urodzenia (data)
              waga (liczba zmiennoprzecinkowa)
              imię opiekuna (ciąg znaków)

            Klasa ta powinna też mieć jedną metodę o nazwie przedstawSie. Metoda ta nie przyjmuje żadnych argumentów i zwraca
              ciąg znaków, który jest zdaniem zawierającym imię kotka, jego datę urodzenia, wagę oraz imię opiekuna.
             */


    }

    public void zadanie1() {
        Kot kot = new Kot("kiciuś", LocalDate.of(2010, 10, 10), 10.0, "Ola");
        System.out.println(kot.przedstawSie());

    }

       /*
       zadanie nr 2

       utworzyć listę 3 kotów a następnie niech każdy z nich się przedstawi.*/

    private void zadanie2() {

        List<Kot> koty = new ArrayList<>();
        koty.add(new Kot("Kicius1", LocalDate.of(2010, 10, 10), 10.0, "Ola"));
        koty.add(new Kot("Kiciuś2", LocalDate.of(2010, 02, 8), 15.0, "Ola"));
        koty.add(new Kot("Kiciuś3", LocalDate.of(2010, 05, 23), 20.0, "Ola"));

        for (Kot kot : koty) {
            System.out.println(kot.przedstawSie());
        }

        //    var kot1 = new Kot("Felix", LocalDate.of(2020, 7, 2), 3.0, "Mariusz");
        //    var kot2 = new Kot("Felix2", LocalDate.of(2020, 8, 2), 3.5, "Mariusz");
        //    var kot3 = new Kot("Felix3", LocalDate.of(2020, 9, 2), 4.0, "Mariusz");
        //
        //    List<Kot> koty = new ArrayList<>();
        //    koty.add(kot1);
        //    koty.add(kot2);
        //    koty.add(kot3);


    }
                  /*
                     Firma
                        Osoba
                          Pracownik
                            Sekretarka
                            Programista
                            Tester
                          Szef
                        adres

                     class Firma {
                     List<Osoba> osoby;
                     String adres
                     }

                     class Osoba {
                       String pietroNaKtorymPracuje;
                     }

                     class Szef extends Osoba {
                       String imie;
                     }

                     class Sekretarka extends Pracownik {
                       String imie;
                     }

                     class Pracownik extends Osoba {

                     }

                      */


    //zadanie 3
    //utworzyc liste 3 kotow

    private void zadanie3() {

        List<Zwierzę> zwierze = new ArrayList<>();
        zwierze.add(new Kot(200.0, true, "Kicius1", LocalDate.of(2010, 10, 10), 10.0, "Ola"));
        zwierze.add(new Kot(200.0, false, "Kiciuś2", LocalDate.of(2010, 2, 8), 15.0, "Ola"));
        zwierze.add(new Kot(250.0, true, "Kiciuś3", LocalDate.of(2010, 5, 23), 20.0, "Ola"));

        for (Zwierzę zw : zwierze) {
            if (zw instanceof Kot) {   //zeby sie upewnic czy faktycznie ten typ ogolny zw jest typu szczegolowego Kot

                System.out.println(((Kot) zw).przedstawSie());
                System.out.println(((Kot) zw).isCzyMaSiers()); //odwolanie do metody
            }
        }

    }

     /*
         zadanie nr 4
         utworzymy klase Pies, ktora dziedziczy po klasie Zwierze
         utworzyć listę 3 kotów, 1 psa następnie  dodać je do List<Zwierze>
         a następnie niech każdy z nich się przedstawi.
         Dodatkowo wywołać metodę (skorzystamy z przysłaniania metod) dajGlos()
        */


    private void zadanie4() {

        List<Zwierzę> zwierze = new ArrayList<>();
        zwierze.add(new Kot(200.0, true, "Kicius1", LocalDate.of(2010, 10, 10), 10.0, "Ola"));
        zwierze.add(new Kot(200.0, false, "Kiciuś2", LocalDate.of(2010, 2, 8), 15.0, "Ola"));
        zwierze.add(new Kot(250.0, true, "Kiciuś3", LocalDate.of(2010, 5, 23), 20.0, "Ola"));
        zwierze.add(new Pies(250.0, true, "Piesio1", LocalDate.of(2010, 5, 23), 20.0, "Ola"));
        zwierze.add(new Pies(250.0, true, "null", LocalDate.of(2010, 5, 23), 20.0, "Ola"));


        for (Zwierzę zw : zwierze) {
            if (zw instanceof Kot) {
                System.out.println(((Kot) zw).przedstawSie());
                System.out.println((zw).dajGlos());
            } else if (zw instanceof Pies) {
                System.out.println(((Pies) zw).przedstawSie());
                System.out.println((zw).dajGlos());
            }

            //System.out.println(zw.dajGlos2());

        }

             DateConverter dateConverter = new DateConverter();
                  try{
                 System.out.println(dateConverter.stringToDate("2022/05/10"));
             } catch(ParseException e){
                 throw new RuntimeException(e);
             }
             }


          //Zadanie 5,
    // utworz enum o nazwie Zwierze w ktorym beda opcje kot i pies.
    // utwórz liste 3 kotów i 1 psa poprzez utworzenie pliku zwierzeta.txt
    // ODczytaj plik przez aplikacje. Dodaj zwierzeta do LIST<Zwierze> a nastepnie  niech kazdy z nich sie
    // przedstawi . Wywolaj metode dajGlos() korzystajac z przeslniania metod

    private void zadanie5() {
        File file = new File("src/main/resources/zwierzeta.txt");

        List<Zwierzę> zwierzeList = pobierzInformacjeZPliku(file);

        for (Zwierzę zw : zwierzeList) {
          System.out.println(((Pies)zw).przedstawSie());
        }
      }

      private List<Zwierzę> pobierzInformacjeZPliku(File file) {
        Scanner scan = null;
        try {
          scan = new Scanner(file);
        } catch (FileNotFoundException e) {
          throw new MojPierwszyException("Komunikat naszego błędu!");
        }

        List<Zwierzę> zwierzeta = new ArrayList<>();

        while (scan.hasNext()){
          String rowInFile = scan.nextLine();
          String[] tablicaPliku = rowInFile.split(",");
          if("PIES".contains(tablicaPliku[0])) {
            Pies pies = new Pies();
            zwierzeta.add(pies.convertFromFile(rowInFile));
          }
        }
         return zwierzeta;
}

      }




















         


























