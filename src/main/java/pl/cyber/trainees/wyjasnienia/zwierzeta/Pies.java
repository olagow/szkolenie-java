package pl.cyber.trainees.wyjasnienia.zwierzeta;

import pl.cyber.trainees.wyjasnienia.DateConverter;

import java.text.ParseException;
import java.time.LocalDate;

public class Pies extends Zwierzę{
    private final String imiePsa;
    private final LocalDate dataUrodzenia;
    private Double waga;
    private String imieOpiekuna;

    public Pies(final Double wzrost,
                final boolean czyMaSiers,
                final String imiePsa,
                final LocalDate dataUrodzenia,
                final Double waga,
                final String imieOpiekuna) {
        super(wzrost, czyMaSiers);
        this.imiePsa = imiePsa;
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieOpiekuna = imieOpiekuna;


    }
    public Pies() {
        super(null, false);
        imiePsa = "";
        dataUrodzenia = LocalDate.now();
    }


    @Override
    public String dajGlos() {
        return "Hauuu";


    }



    public String przedstawSie() {

        return "Jestem psem. Moje imię: " + this.imiePsa
                + "Moja data urodzenia: " + this.dataUrodzenia
                + "waga:" + waga
                + "imie opiekuna" + this.imieOpiekuna;

    }

    public Pies convertFromFile(String rowInFile) {
        String[] tablicaPliku = rowInFile.split(",");
        DateConverter dateConverter = new DateConverter();
        LocalDate dataUrodzenia = null;
        try {
            dataUrodzenia = dateConverter.stringToDate(tablicaPliku[2]);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return new Pies(
                Double.valueOf(tablicaPliku[5]), Boolean.parseBoolean(tablicaPliku[6]), tablicaPliku[1],
                dataUrodzenia, Double.valueOf(tablicaPliku[3]), tablicaPliku[4]
        );
    }


    public String getImiePsa() {
        return imiePsa;
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


}
