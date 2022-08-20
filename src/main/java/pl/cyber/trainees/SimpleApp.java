package pl.cyber.trainees;

import pl.cyber.trainees.wyjasnienia.*;
import pl.cyber.trainees.wyjasnienia.bankomat.BankomatService;

public class SimpleApp {



    public static void main(String[] args) throws Exception {


//
//
//        Petle petle = new Petle();
//        petle.uruchom();
//        petle.liczbyPodzielne();
//        petle.pierwszyProgramWhile();
//        petle.sumaLiczbZForIWhile();
//        petle.silnia();
//
//
//
//
////        InstrukcjeWarunkowe instrukcjeWarunkowe = new InstrukcjeWarunkowe();
////        instrukcjeWarunkowe.uruchom();
//
//        TabliceWyjasnienia tablice = new TabliceWyjasnienia();
//        tablice.uruchom();
//
//
//        Wyjatki wyjatki = new Wyjatki();
//        wyjatki.uruchom();
//
//        WyjatkiPowtorka powtorka = new WyjatkiPowtorka ();
//        powtorka.uruchom();
//
//
//        Obiekty obiekty = new Obiekty();
//        obiekty.uruchom();


        BankomatService bankomat = new BankomatService();
        bankomat.uruchomRozwiazanie1();
        bankomat.uruchomRozwiazanie2();


    }


}