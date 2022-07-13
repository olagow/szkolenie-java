package pl.cyber.trainees;

import java.math.BigDecimal;
import java.util.Scanner;

/*1) do wykonanaia zadanie, które polega na pobraniu od użytkownika informacji wprowadzonych z klawiatury.
        a) 5 razy Integer
        b) 5 razy BigDecimal
        dla każdej opcji powyżej wykonać dodawanie wprowadzonych liczb, mnożenie przez 10 każdej z liczb oraz dzielenie przez 2 każdej z liczb
        Wyniki zaprezentować w postaci:
        Dodawanie liczb [a, b, c, d, e]: w
        Mnożenie przez 10 liczb:
        a*10: w
        b*10: w
        c*10: w
        d*10: w
        e*10: w
        etc.
*/
public class zadanie1 {
    public static void main(String[] args) {

        Integer[] tablicaInteger = new Integer[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Wprowadź liczbę nr: " + (i+1));
            tablicaInteger[i] = scan.nextInt();
        }

        Integer wynikDodawania = 0;
        for (int i=0; i<5; i++) {
            wynikDodawania=wynikDodawania+tablicaInteger[i];
        }
        System.out.println("Wynik dodawania: " + wynikDodawania);

        Integer[] wynikMnozenia = new Integer [5];

        for (int i=0; i<5; i++) {
            wynikMnozenia[i]=tablicaInteger[i]*10;
        }

        System.out.println("Wynik mnożenia: " + wynikMnozenia);
    }




}




