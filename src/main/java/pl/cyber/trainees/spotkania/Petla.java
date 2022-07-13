package pl.cyber.trainees.spotkania;

import pl.cyber.trainees.kalkulator.Dodawanie;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Petla {

    //utworzyc metode, ktora wyswietli liczby calkowite od 1 do 100
    // i prawidlowo uzyc w Simple Apps


    public void wyswietlOd1Do100() {
    //    for (int i = 0; i < 100; i++) {
    //    System.out.print(i + 1);
   //    System.out.print(", ");
    //    }

        for (int i = 1; i < 100; i++) {
            if (i < 100) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i + ".");
            }
        }

        //System.out.print(i);

    }

    // utworzyc nowa metode, w ktorej przekazemy jako parametr Listę Double.
    // w ramach petli foreach wykonamy dodawanie wartosci z listy
    // nastepnie prosze wyswietlic wynik dodawania w postaci: Wynik dodawania z listy: XYZ
    //XYZ - wynik dodawania
    // w ramach pl.cyber.trainees powinien pojawić się kalkulator który będzie niezbędny do wykonania zadania

    public void dodawanieElementowListy(List<Double> lista) {

        Double result = 0.0;

        for (Double element : lista) {
            System.out.println("Teraz wykonuję operację: " + element + " + " + result);
            result = Dodawanie.add(result, element); //odwolanie do juz stworzonej klasy
        }
        // result = result + element


        System.out.println("Wynik dodawania listy: " + result);

    }

      //Set.of() można ustawiać kolekcję Set, należy pamiętać, że maksymalnie przyjmuje 10 elementów
    //Użycie Set.of() stosowane jest dla kolekcji o małej liczbie elementów, głównie w ramach testów jednostkowych.

    //Utworzenie metody, która wyswietli zbadany set
    //Set<Integer> intset = new HashSet <>();
    // Set<Integer> intSet = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
    // następnie przez pętlę foreach wyświetlić elementy.
    // Wyświetlenie w następujący sposób: To jest element seta:



    public void wyswietlSet() {
      //  Set<Integer> intSet = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));

        //Integer nazwa Zmiennej = 0; -> Typ nazwaZmiennej = (przypisane wartości) 0(wartość)
        //List<Double> lista = new ArrayList<>()    ->
        /*  List, Set, Map  - interface kolekcji
        List <- interface mechanizmu.   Interface - zbiór dostępnych metod do wykonania
        <Typ> <- deklaracja przechowywanego typu. Jest możliwe String, BigDecmial, Double, Model, Pojazd, etc.
        nie można podawać metod ani klas
        lista <- nazwaZmiennej
        = - deklaracja wartości
        new - opisane w słowniku-pojęć
        ArrayList<>() - wybór konkretnej implementacji interface'u List
 */
        Set<Integer> intSet = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));

        for (Integer element :
                intSet) {
            System.out.println("To jest element seta: " + element);
        }

    }
}




