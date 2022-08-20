package pl.cyber.trainees.wyjasnienia.bankomat;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BankomatService {

    Scanner scanUser = new Scanner(System.in);
    Bankomat bankomat = new Bankomat();

    private boolean menu(final Integer pozycja) {

        Integer kwota = 0;

        try {
            switch (pozycja) {

                case 1:
                    System.out.println("Wpłacam gotówkę");

                    System.out.println("Proszę podać kwotę wpłaty: ");
                    kwota = scanUser.nextInt();
                    sprawdzWprowadzoneKwoty(kwota);

                    bankomat.wplacGotowke(kwota);


                    break;
                case 2:
                    System.out.println("Wypłacam gotówkę");
                    System.out.println("Proszę podać kwotę wypłaty: ");
                    kwota = scanUser.nextInt();
                    sprawdzWprowadzoneKwoty(kwota);

                    bankomat.sprawdzWyplate(kwota);
                    bankomat.wyplacGotowke(kwota);

                    break;
                case 3:
                    System.out.println("Stan konta");
                    System.out.println("Bankomat posiada: " + bankomat.stanKonta());
                    break;
            }

        } catch (InputMismatchException e) {
            throw new BusinessException("Nie podano prawidłowej liczby odnoszącej się do wpłyaty/wypłaty.");
        }


        return pozycja != 4;

    }

    //pkt 3 i 4
    private void sprawdzWprowadzoneKwoty(final Integer kwota) {
        List<Integer> lista = List.of(10, 20, 50, 100, 200, 500);

        if (!lista.contains(kwota)) {
            //'!' - co mam zrobic, jesli kwota nie zawiera sie w liscie
            throw new BusinessException("Wprowadź poprawną kwotę");


        }

    }

    public void uruchomRozwiazanie1() {

        boolean czyKontynuowac;

        do {

            System.out.println("Wybierz dostępną opcję:");
            System.out.println("1. Wpłać Gotówkę");
            System.out.println("2. Wypłać Gotówkę");
            System.out.println("3. Sprawdź stan konta");
            System.out.println("4. Przerwij Operację");

            //String userInfo = scanUser.nextLine();
            //var userInfo = scanUser.nextLine();

            Integer userInfo = 4;

            try {
                userInfo = scanUser.nextInt();
            } catch (InputMismatchException e) {
                throw new BusinessException("Nie podano prawidłowej liczby z menu.");
            }

            czyKontynuowac = menu(userInfo);

        } while (czyKontynuowac);

    }

    public void uruchomRozwiazanie2() {

        List<Karta> karty = List.of(
                new Karta(12345678, 1234, 1000),
                new Karta(33345678, 9876, 2000)
        );

        boolean czyKontynuowac;
        boolean czyPrawidlowaKarta = false;
        Karta karta = null;

        System.out.println("Włóż kartę");
        Integer nrKarty = scanUser.nextInt();
        System.out.println("Wprowadź pin dla karty");
        Integer pinKarty = scanUser.nextInt();

        for (Karta el : karty) {
            if (el.getNrKarty().equals(nrKarty)) {
                el.sprawdzNrPin(pinKarty);
                czyPrawidlowaKarta = true;
                karta = el;

            }
        }

        if (!czyPrawidlowaKarta || karta == null) {
            throw new BusinessException("Wprowadzono błędne dane karty.");
        }

        do {

            System.out.println("Wybierz dostępną opcję:");
            System.out.println("1. Wpłać Gotówkę");
            System.out.println("2. Wypłać Gotówkę");
            System.out.println("3. Sprawdź stan konta");
            System.out.println("4. Sprawdź stan konta karty");
            System.out.println("0. Przerwij Operację");

            //String userInfo = scanUser.nextLine();
            //var userInfo = scanUser.nextLine();

            Integer userInfo = 0;

            try {
                userInfo = scanUser.nextInt();
            } catch (InputMismatchException e) {
                throw new BusinessException("Nie podano prawidłowej liczby z menu.");
            }

            czyKontynuowac = menu2(userInfo);

        } while (czyKontynuowac);

    }

    private boolean menu2(final Integer pozycja) {

        Integer kwota = 0;

        try {
            switch (pozycja) {

                case 1:
                    System.out.println("Wpłacam gotówkę");

                    System.out.println("Proszę podać kwotę wpłaty: ");
                    kwota = scanUser.nextInt();
                    sprawdzWprowadzoneKwoty(kwota);

                    bankomat.wplacGotowke(kwota);


                    break;
                case 2:
                    System.out.println("Wypłacam gotówkę");
                    System.out.println("Proszę podać kwotę wypłaty: ");
                    kwota = scanUser.nextInt();
                    sprawdzWprowadzoneKwoty(kwota);

                    bankomat.sprawdzWyplate(kwota);
                    bankomat.wyplacGotowke(kwota);

                    break;
                case 3:
                    System.out.println("Stan konta");
                    System.out.println("Bankomat posiada: " + bankomat.stanKonta());
                    break;
            }

        } catch (InputMismatchException e) {
            throw new BusinessException("Nie podano prawidłowej liczby odnoszącej się do wpłyaty/wypłaty.");
        }

        return pozycja !=0;
    }
}
