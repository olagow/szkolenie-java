

package pl.cyber.trainees;
import pl.cyber.trainees.wyjasnienia.zadanieDomowe29tydz;

public class SimpleApp {

    public static void main(String[] args) {


        zadanieDomowe29tydz zadanie = new zadanieDomowe29tydz();


        Integer age = zadanie.WyswietlWiek();
        System.out.println("Mój wiek :" + age);

        String name = zadanie.ZwrocImie();
        System.out.println("Moje imię :" + name);


        boolean czyParzysta = zadanie.LiczbyParzyste(6);
        System.out.println("Czy liczba jest parzysta :" + czyParzysta);

        boolean czyPodzielnePrzez35 = zadanie.podzielna35(60);
        System.out.println("Czy liczba jest podzielna przez 3 i 5 :" + czyPodzielnePrzez35);


        double LiczbaDoPotegi = zadanie.LiczbaDoPotegi(6.0);
        System.out.println("Liczba Do Potęgi 3: " + LiczbaDoPotegi);

        double Pierwiastek = zadanie.Pierwiastek(9.0);
        System.out.println("Pierwiastek kwadratowy: " + Pierwiastek);


    }
}