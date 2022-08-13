package pl.cyber.trainees.wyjasnienia;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WyjatkiPowtorka{

    public void uruchom() throws IOException {
        dzielenieLiczbPowtorka();
        pierwiastek();
        pierwiastekDwa();
    }

    //Uzycie scanera , aby pobrac 2 zmienne
    //i wykonac dzialanie dzielenia liczb
    public void dzielenieLiczbPowtorka() throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę a: ");
        Integer a = scanner.nextInt();
        System.out.println("Podaj liczbę b: ");
        Integer b = scanner.nextInt();

        System.out.println("Wynik dzielenia a i b " + a/b);


        try {
            System.out.println("Wynik dzielenia a i b " + a / b);
        }catch (ArithmeticException ex){
            System.out.println("Niedozwolona operacja dzielenia przez 0. Użytkownik podał a: " + a + " b: " + b);
        }


    }



    //Zadanie2
    //Utworzyć metodę która pobierze od użytkownika liczbę i wyświetli jej pierwiastek.
    //  Jeśli użytkownik poda liczbę ujemną to należy rzucić IllegalArgumentException oraz obsłużyć sytuację w której użytkownik
    // poda ciąg znaków, który nie jest liczbą.

    public void pierwiastek() {

        System.out.println("Podaj liczbę do pierwiastka: ");

        Scanner scanner = new Scanner(System.in);
        Integer c = null;
        try {
            c = scanner.nextInt();

            }catch (InputMismatchException ex){
            System.out.println("Została podana inna wartość niż liczba!!");
            c = 0;
         }

        if (c<0) {
            throw new IllegalArgumentException("Została podana liczba ujemna");

        }

        System.out.println("Pierwiastek liczby " + c + " to: " + Math.sqrt(c));
    }


         public void pierwiastekDwa(){

             Scanner scanner = new Scanner(System.in);
             String d = scanner.next();

             try {
                 if ("".equals(d) || Integer.parseInt(d) < 0) {
                     throw new IllegalArgumentException("została podana liczba ujemna");

                 }
             }catch(NumberFormatException e){
             System.out.println(" Get Message: " + e.getMessage());
             System.out.println(" Get StackTrace: ");

             for (StackTraceElement element : e.getStackTrace()) {
                     System.out.println(element);

             }
                 System.out.println();
                 throw new IllegalArgumentException("Została podana inna wartość niż liczbowa jej wartość: " + d );
             }
             System.out.println("Pierwiastek liczby " + d + " to: " + Math.sqrt(Integer.parseInt(d)));
         }

            //Zadanie 3
             //Przekaż do tej metody null i zobacz, jaki wyjątek został zgłoszony.
             //metoda powinna przyjąc parametr oraz zwrócić wartość
            //przekazały String a returnem string.length()

}







