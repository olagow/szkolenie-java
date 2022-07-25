package pl.cyber.trainees.dziedziczenie;

//extends - słowo kluczowe przy dziedziczeniu klas
// super - slowo kluczowe stosowane przy dziedziczeniu odnosi sie do konstruktora klasy nadrzednej
public class Model extends Pojazd{

    private final String nazwa;
    private final Integer przebieg;
    private final Double pojemnoscSilnika;
    private final Kolor kolor;



    public Model() {
        super ();
        this.nazwa = "";
        this.przebieg = 0;
        this.pojemnoscSilnika = 0.0;
        this.kolor = null;


    }

    public Model
            (String marka, String rocznik,
             String napęd, String nazwa,
             Integer przebieg,
             Double pojemnoscSilnika,
             Kolor kolor) {

        super(marka, rocznik, napęd);
        this.nazwa = nazwa;
        this.przebieg = przebieg;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.kolor = kolor;
    }

    @Override //adnotacja wykorzystywana do przyslaniania metod
    public String toString(){
<<<<<<< HEAD
        return "Marka: " + getMarka()
               + " rocznik: " + getRocznik()
               + " naped: " + getNaped()
               + " nazwa modelu: " + this.nazwa
               + " przebieg: " + this.przebieg
               + " pojemoscsilnika: " + this.pojemnoscSilnika
               + " kolor: " + this.kolor;
    }

=======
        return "Marka: " + getMarka();
               + "rocznik" + getRocznik();
               + "naped" + getNaped();
               + "nazwa modelu" + this.nazwa;
               + "przebieg: " + this.przebieg;
               + "pojemoscsilnika: " this.pojemnoscSilnika;
               +  "kolor: " this.kolor;

    }


>>>>>>> origin/spotkanie2207
    public String getNazwa() {
        return nazwa;
    }

    public Kolor getKolor() {
        return kolor;
    }

    public Double getPojemnoscSilnika(){
        return pojemnoscSilnika;
    }

    public Integer getPrzebieg(){
        return przebieg;


    }


}

