package pl.cyber.trainees.dziedziczenie;

//Nowa klasa okręslająca markę pojazdu
public class Pojazd {


   private String marka;
    private String rocznik;
    private String naped;



    public Pojazd (){
    marka = "";
    rocznik = "";
    naped = "";

    }

    //Alt + Insert construktor

    public Pojazd(String marka, String rocznik, String napęd) {
        this.marka = marka;
        this.rocznik = rocznik;
        this.naped = naped;
    }


    public String toString(){
        return "marka: " + this.marka
                + "rocznik: " + this.rocznik
<<<<<<< HEAD
                + "napęd: " + this.naped;
=======
                + "napęd: " + this.naped
>>>>>>> origin/spotkanie2207

    }

    //getery- zad: pobieranie informacji z pól klasy
    //do dalszego przetwarzania

    public String getMarka (){
<<<<<<< HEAD
        return marka;
    }

    public String getRocznik (){
        return rocznik;
    }

    public String getNaped (){
        return naped;
=======
        return marka
    }

    public String getRocznik (){
        return rocznik
    }

    public String getNaped (){
        return naped
>>>>>>> origin/spotkanie2207
    }
}
