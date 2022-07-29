package pl.cyber.trainees.wyjasnienia;

import pl.cyber.trainees.kalkulator.Dodawanie;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Petle {

   /*
Pętla for i foreach

BUDOWA for
int i = 0 - inicjalizacja parametru początkowego 'do przechodzenia po pętli'
i<5 - warunek spełnienia kolejnego przejścia
i++ - inkrementacja wartości początkowej o 1
for(int i = 0; i<5; i++) {
//kod wykonania
//pritnln
//dodawnie w jakiś sposób
//dodawanie do listy elementy
}

JAK NIE STOSOWAĆ FOR
for(int i = 0; i<5; i++); {

}

PUŁAPKA:
for(int i = 0; i<5; i--); { -- tzw pętla nieskończona
 println(i);
 }

 for(int i = 0; i=-5; i++); { -- tzw pętla nieskończona
 println(i);
 }


 BUDOWA foreach
 for(TypDanych elementListy : lista) {
 }

 UWAGA!!!
 Usuwanie elementów z listy
 do rozwiązania usuwania elementów stosuję się wyłącznie for.
 for(int i = 0; i<5; i++) {
 lista.get(i)
 }

 List<>
 remove(); metoda do usuwania rekordów
   */

    public void uruchom() {
        List<BigDecimal> lista = new ArrayList<>();
        lista.add(BigDecimal.valueOf(10.0));
        lista.add(BigDecimal.valueOf(2.0));
        lista.add(BigDecimal.valueOf(5.6));
        lista.add(BigDecimal.valueOf(21.8));
        lista.add(BigDecimal.valueOf(2.1));
        lista.add(BigDecimal.valueOf(41.0));
        lista.add(BigDecimal.valueOf(14.0));
        lista.add(BigDecimal.valueOf(1.0));
        lista.add(BigDecimal.valueOf(4.0));

        rozwiazanieZadanie1(lista);
        choinkaRozbudowana(4);
    }

    //  Zadanie nr 1
//  Wykonać metodę która przyjmie jako parametr List<BigDecimal>, następnie wykona następujące zagadnienia:
//  a) wyświetli każdy element listy jeden po drugim
//  b) każdy element listy doda do siebie.

    private void rozwiazanieZadanie1(List<BigDecimal> list) {
//            BigDecimal sumaLiczb = BigDecimal.ZERO;
            BigDecimal sumaLiczb = BigDecimal.valueOf(0);


        for (BigDecimal liczba :
                list) {

            System.out.println(liczba);

            sumaLiczb = sumaLiczb.add(liczba);

        }

                System.out.println("Suma liczb: " + sumaLiczb);
            }

        //Zadanie Choinka
        //klasyczne fory (a dokladnie 2 fory)
        //
        //metoda bedzie przyjmowac parametr jako wysokosc

        private void choinkaProsta() {
            System.out.println("  *");
            System.out.println(" ***");
            System.out.println(" *****");
        }

    private void choinkaRozbudowana(Integer wysokoscChoinki) {

        Integer iloscGwiazdekWPodstawie = (wysokoscChoinki *2) - 1;

        for(int wysokosc = 1; wysokosc < wysokoscChoinki; wysokosc++) {
            for (int szerokosc = 1; szerokosc < iloscGwiazdekWPodstawie; szerokosc++) {
                if (szerokosc < wysokosc) {
                    System.out.println(" ");
                } else {
                    System.out.println("*");
                }
            }
                System.out.println();
            }
        }

//        for (int wysokosc = 0; wysokosc < wysokoscChoinki; wysokosc++) {
//            for (int szerokosc = 0; szerokosc < wysokoscChoinki*2; szerokosc++) {
//                if(szerokosc < (wysokoscChoinki - wysokosc) || szerokosc > (wysokoscChoinki + wysokosc)) {
//                    System.out.print(" ");
//                } else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();



    }









