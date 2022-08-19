package pl.cyber.trainees.wyjasnienia;

//Rodzaje obiektow w Java
//POJO Plain Old Java Object - reprezentuje obiekty bez adnotacji
//DTO -> Data Transfer Object - obiekty, ktore przesylaja informacje
//Encja - obiekt DTO,ktory ma za zadanie reprezentowac strukture tabeli bazy danych
//value object - obiekt z jednym parametrem oraz (posiadaja tylko metode getter bez metody setter), ktory waliduje poprawna strukture
// tzn czy parametr nie jest null i czy posiada wartosc


/*
Inaczej mówiąc objekt Javowy, którego zadaniem jest przenoszenie specyficznych danych.

Najczęstsze wykorzystanie:
1) komunikacja klient - server. Innymi słowy Frontend(WEB) - Backend, Aplikacja Moblie - Backend.
2) komunikacja baza danych - Backend

Cechy szczególne obiektów:
1) pola (parametry) opisujące konkretny objekt np. Samochod pola samochodu np. Makra, kolor, przebieg, etc.
2) posiadają konstruktor do prawidłowego utworzenia objektu danej klasy
3) posiada konkretne metody odwołujące się do utworzonego objektu
    (metody typu Getter, Setter, toString, etc.)
4) może posiadać wewnętrznie swój konwerter
np do konwersji objektu DTO bazy danych(Encji) na objekt do reprezentacji dla aplikacji Frontendowej

 */

import pl.cyber.trainees.wyjasnienia.Wyjatek.MojUncheckedException;

import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.List;


public class TalkDTO {

    private final String tematRozmowy;
    public String opis; //bez modyfikatora private i ustawienia zmiennej jako final możemy dopuścić sytuację,
    // w której nieświadomie damy możliwość zmiany wartości parametru klasy
    private List<String> przyklady;

    public TalkDTO(
            final String tematRozmowy,
            final String opis,
            final List<String> przyklady
    ) {

        this.tematRozmowy = tematRozmowy;
        this.opis = opis;
        this.przyklady = przyklady;
    }

    public String getTematRozmowy() {
        return tematRozmowy;
    }

    public String getOpis() {
        return opis;
    }

    public void setPrzyklady(final List<String> przyklady) {
        this.przyklady = przyklady;
    }

    public void setOpis(final String opis) {
        this.opis = opis;
    }

    public List<String> getPrzyklady() {
        return przyklady;
    }

    public void modifyList(List<String> wiecejPrzykladow) {
        this.przyklady.addAll(wiecejPrzykladow);
    }
}

    /*public TalkDTO(
            final String tematRozmowy,
            final List<String> przyklady) {


        if(tematRozmowy ==null && !"".contains(tematRozmowy)){ //value object
            throw new MojUncheckedException("parametr przyklady jest pusty");

        }


        if (przyklady == null || przyklady.isEmpty()) {
            throw new MojUncheckedException("parametr przyklady jest pusty");
        }

        this.tematRozmowy = tematRozmowy;
        this.przyklady = przyklady;

//    this.przyklady = przyklady.isEmpty() ? new ArrayList<>() : przyklady;

        //postać równoważna do: this.przyklady = przyklady.isEmpty() ? new ArrayList<>() : przyklady;

    /*
        IV konstrukcja warunkowa if
        przyklady.isEmpty() ? new ArrayList<>() : przyklady

        wszystko przed znakiem ? to jest warunek sprawdzający czyli if(przyklady.isEmpty())
        między znakiem ? a znakiem : znajduje się instrukcja, jeżeli true inaczej mówiąc zawartość pierwszego bloku w instrukcji if
        wszystko po znaku : znajduje się instrukcja, jeżeli false, inaczej mówiąc zawartość bloku w instrukcji else
     */
//
//        if (przyklady == null || przyklady.isEmpty()) {
//            this.przykłady = new ArrayList<>();
//        } else {
//            this.przykłady = przyklady;
//        }
  /*  }

    public String getTematRozmowy () {
        return tematRozmowy;
    }

    public List<String> getPrzykłady() {
        return przyklady;
    }

    public String toString () {
        return "Informacja o klasie TalkDTO: { tematRozmowy: " +
                this.tematRozmowy + "\nPierwszy przyklad: " + this.przyklady.get(0) + "}";

    }


}
*/
