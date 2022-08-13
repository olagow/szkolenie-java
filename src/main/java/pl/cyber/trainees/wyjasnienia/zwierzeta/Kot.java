package pl.cyber.trainees.wyjasnienia.zwierzeta;

import java.time.LocalDate;

public class Kot extends Zwierzę {

/*
  Utwórz klasę Kot . Klasa ta powinna mieć następujące pola:

    imię (ciąg znaków)
    data urodzenia (data)
    waga (liczba zmiennoprzecinkowa)
    imię opiekuna (ciąg znaków)

  Klasa ta powinna też mieć jedną metodę o nazwie przedstawSie. Metoda ta nie przyjmuje żadnych argumentów i zwraca
    ciąg znaków, który jest zdaniem zawierającym imię kotka, jego datę urodzenia, wagę oraz imię opiekuna.
   */

    private final String imieKota;
    private final LocalDate dataUrodzenia;
    private Double waga;
    private String imieOpiekuna;

    public Kot(
            final String imieKota,
            final LocalDate dataUrodzenia,
            final Double waga,
            final String imieOpiekuna) {

        super(0.0, true);//odwolanie do konstruktora klasy po ktorej dziedziczymy

        this.imieKota = imieKota;
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieOpiekuna = imieOpiekuna;


    }

    @Override
    public String dajGlos() {
        return "Miauuu";
    }


    public Kot(final Double wzrost, final boolean czyMaSiersc,
            final String imieKota,
            final LocalDate dataUrodzenia,
            final Double waga,
            final String imieOpiekuna) {

        super(wzrost,czyMaSiersc);
        this.imieKota = imieKota;
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieOpiekuna = imieOpiekuna;
    }

    public String getImieKota() {
        return imieKota;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public Double getWaga() {
        return waga;
    }

    public String getImieOpiekuna() {
        return imieOpiekuna;
    }

    public Kot() {
        super(0.0, true);
    }

    public String przedstawSie() {

        return "Jestem kotem. Moje imię: " + this.imieKota
                + "Moja data urodzenia: " + this.dataUrodzenia
                + "waga:" + waga
                + "imie opiekuna" + this.imieOpiekuna;

    }

}

