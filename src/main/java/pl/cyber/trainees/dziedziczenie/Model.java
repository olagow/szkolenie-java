package pl.cyber.trainees.dziedziczenie;

//extends - słowo kluczowe przy dziedziczeniu klas
// super - slowo kluczowe stosowane przy dziedziczeniu odnosi sie do konstruktora klasy nadrzednej
public class Model extends Pojazd{

    private String nazwa;
    private Integer przebieg;
    private Double pojemnoscSilnika;
    private Kolor kolor;



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
        return "Marka: " + getMarka();
               + "rocznik" + getRocznik();
               + "naped" + getNaped();
               + "nazwa modelu" + this.nazwa;
               + "przebieg: " + this.przebieg;
               + "pojemoscsilnika: " this.pojemnoscSilnika;
               +  "kolor: " this.kolor;

    }


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
 public void setNazwa (final String nazwa) {
        this.nazwa = nazwa;
 }

    public void setPrzebieg(final Integer przebieg) {
        this.przebieg = przebieg;
    }

    public void setPojemnoscSilnika(final Double pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public void setKolor(final Kolor kolor) {
        this.kolor = kolor;
    }
}


}

