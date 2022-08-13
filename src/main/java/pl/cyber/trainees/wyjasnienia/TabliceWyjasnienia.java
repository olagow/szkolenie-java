package pl.cyber.trainees.wyjasnienia;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TabliceWyjasnienia {

    public void uruchom() {

        tablicaProsta();
        wyswietlTabliceZRandom();
        tablicaWielowymiarowa();
        wyswietlListeZRandom();
    }

/*
  Tworzenie tablic jednowymiarowych w Java
  TypDanych[] nazwa_tablicy = new TypDanych[(int) zakres_tablicy];
  np.
  Integer[] tablicaInt = new Integer[10];
  Integer[] nowaTablica = {1, 2, 3, 4, 19};
  Zalecana forma:
  Integer[] nowaTablica = new Integer[5];
  nowaTablica[0] = 1;
  nowaTablica[1] = 2;
  nowaTablica[2] = 3;
  nowaTablica[3] = 4;
  nowaTablica[4] = 19;
   */
  /*
  Tworzenie tablic wielowymiarowych w Java
  TypDanych[][] nazwa_tablicy = new TypDanych[(int) zakres_tablicy1][zakres_tablicy2];
  Integer[][] tablicaInt = new Integer[10][10];
  Integer[][] nowaTablica = new Integer[1][1];
  nowaTablica[A][1] = 1;
  nowaTablica[0][1] = 1;
  nowaTablica[1][0] = 1;
  nowaTablica[1][1] = 1;
   */

  /*
  odwołanie się do tablic
  System.out.println(nowaTablica[0]);
  System.out.println(nowaTablica[0][0]);
   */
  /*
  Częsty błąd przy tablicach:
  ArrayIndexOutOfBoundsException - Przekroczenie wielkości tablicy
  Integer[] tablicaInt = new Integer[10];
  tablicaInt[11] = 2;
   */

    //zadanie1
    // utworzyc tablice o wymiarze 5 elementow i przypisac do niej "randomowe" wartosci
    //nastepnie prosze o wyswietlenie wszystkich elementow tablicy (tak dziala while oraz for)


    private void tablicaProsta(){

        Integer[] tablica1 = new Integer[5];
        tablica1[0] = 1;
        tablica1[1] = 4;
        tablica1[2] = 5;
        tablica1[3] = 7;
        tablica1[4] = 15;


        for (int i = 0; i < tablica1.length; i++) {
            System.out.println("Wyświetl liczbę: " + tablica1[i]);

        }
    }

        // zad1Tablice();
        //    }
        //    private void zad1Tablice(){
        //
        //        Integer[] tablica1= new Integer[5];
        //        tablica1[0]=2;
        //        tablica1[1]=3;
        //        tablica1[2]=3;
        //        tablica1[3]=5;
        //        tablica1[4]=5;//System.out.println("While");

        //int n=0;
        //while (n< tablica1.length){
         //   System.out.println(tablica1[n]);
         //   n++; // pamietac o inkrementatorze !
        //}

        //System.out.println("DLA For");
        //for (int i = 0; i< tablica1.length; i++){
        //    System.out.println(tablica1[i]);

        //}

        //for (Integer element :
        // tablica1) {
        //System.out.println(element);
         //    }



    //zadanie 2
    //utworzyc tablice  o wymiarze 15 elelmntow i przypisac do niej randomowe wartosci
    ///przy uzyciu obiektu Random z zakresu 50 do 200
    //nastepnie prosze o wyswietlenie wszystkich elementow tablicy (tak dziala while i for)

    private void wyswietlTabliceZRandom() {
        Integer[] tablica1 = new Integer[5];

        Random rand = new Random();

        //użyć wystarczy rand.nextInt();
        // rand.nextInt(liczba);
        // rand.nextInt(200); -> losowanie liczb z zakresu 0 - 200
        // rand.nextInt(150)+50; -> losowanie liczb z zakresu 50 - 200
        // rand.nextInt(KoniecZakresu-PoczątekZakresu)+Początek zakresu;

        for (int i=0; i<tablica1.length; i++){
            tablica1[i] = rand.nextInt(150)+50;
        }

        for (Integer element :
                tablica1) {
            System.out.println(element);
        }
    }
        ///Zadanie 3
        //Zadanie 2 przerobić w taki spobób aby tablicę zastąpić listą
        private void wyswietlListeZRandom() {

            List<Integer> tablica1 = new ArrayList<>();
            Random rand = new Random();
/*
Przypisanie wielu wartości do tablicy
    for (int i=0; i<tablica1.length; i++){
      tablica1[i] = rand.nextInt(150)+50;
    }
Przypisanie wielu wartości do listy
  for (int i=0; i<5; i++){
    tablica1.add(rand.nextInt(150)+50);
  }
 */
            for (int i=0; i<5; i++){
                tablica1.add(rand.nextInt(150)+50);
            }

            for (Integer element :
                    tablica1) {
                System.out.println(element);
            }

        }


    //Zadanie 4
    //na przykładzie powyższych zadań utworzyć tablicę wielowymiarową 10x10
    // i wypełnić losowymi danymi

    private void tablicaWielowymiarowa() {
        Integer[][] tablica1 = new Integer[10][10];
        Random rand = new Random();

        for (int i =0; i<tablica1.length; i++) {
            for (int j =0; j<tablica1.length; j++ ){
                tablica1[i][j] = rand.nextInt(150)+50;
            }
        }

        for (int i =0; i<tablica1.length; i++) {
            for (int j =0; j<tablica1.length; j++ ){
                System.out.println(tablica1[i][j]);
            }
        }


    }
        }


