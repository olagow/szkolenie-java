package pl.cyber.trainees.wyjasnienia;

import java.math.BigDecimal;

public class Talk { //tu zaczyna się klasa

    private String SPACJA = " "; //parametr klasy

    public String nazwa_metody(String parametr) { // tu zaczyna się klasa nr 1
        // Metoda coś wykonuje


        return "zwracamy napis";
    } // tu kończy sie klasa na 1

    private BigDecimal nazwa_metody2(BigDecimal parametr) {// tu zaczyna się klasa nr 2
        //Metoda coś wykonuje }
        //return BigDecimal.ONE;

        String liczba1 = "1";
        String liczba2 = "12";

        return new BigDecimal(liczba1 + liczba2); //112
    } // tu kończy sie klasa nr 2

} //tu kończy się nasza klasa



