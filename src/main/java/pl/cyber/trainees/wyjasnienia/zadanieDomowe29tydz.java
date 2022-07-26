package pl.cyber.trainees.wyjasnienia;

public class zadanieDomowe29tydz {


    public Integer WyswietlWiek() {
        Integer age = 100;
        return age;
    }

    public String ZwrocImie() {
        String name = "Ola";
        return name;


    }

    //zadanie
    //Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta,
    //parzystość sprawdzamy przez znak % 2 inaczej sprawdzamy jej podzielność przez 2
    //np. 2 % 2

    public boolean LiczbyParzyste(Integer number) {

        if ( number % 2 == 0) {
            return true;
        } else {
            return false;
        }


    }

    // Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez 3 i przez 5

    public boolean podzielna35(Integer number) {

        if  ( (number %3 == 0 ) && (number %5 == 0) ) {
            return true;
        }else{
            return false;
        }

    }


    // Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi,
    //podniesienie do potęgi realizujemy przez bibliotekę Math i jej metodę pow(liczba, doJakiejPotęgi)
    //np. Math.pow(2,3)

    public Double LiczbaDoPotegi(Double podstawa){
        return Math.pow(podstawa,3);
    }

    //Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy
    //pierwiastek kwadratowy realizujemy przez bibliotekę Math i jej metodę sqrt(number)
    //Math.sqrt(number)

    public Double Pierwiastek(Double liczba){
        return Math.sqrt(liczba);
    }



}



