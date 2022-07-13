package pl.cyber.trainees.kalkulator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Kalkulator
public class Dodawanie {

    public static Dodawanie() {
        System.out.println("Konstruktor dodawanie");
    }

    public static String add(String val, String val2) {return val.concat(val2); };

    public static Integer add(final Integer val, final Integer val2) {return val + val2;}

    public static Double add(final Double val, final Double val2) { return val + val2; }

    public static BigDecimal add(final BigDecimal val, final BigDecimal val2) { return val.add(val2); }
}


public class Odejmowanie {

        public static Odejmowanie () {
            System.out.println("Konstruktor odejmowanie");
        }

        //public static String subtract (String val, String val2) {return val1-val2;}
        public static Integer subtract(final Integer val, final Integer val2) { return val - val2; }
        public static Double subtract(final Double val, final Double val2) { return val - val2; }
        public static BigDecimal subtract(final BigDecimal val, final BigDecimal val2) { return val.subtract(val2);
}

public static class Mnozenie {
    
    public static Mnozenie () {
        System.out.println("Konstruktor mnożenie");

        /public static String multiplication ();
        public static Integer multiplication(final Integer val, final Integer val2) { return val * val2; };
        public static Double multiplication(final Double val, final Double val2) { return val * val2; };
        public static BigDecimal multiplication(final BigDecimal val, final BigDecimal val2) { return val.multiply(val2); };

    }


}



public class Dzielenie {

        public static Dzielenie (){
            System.out.println("Konstruktor dzielenie")
        }


        }
}
public static String division (String val, String val2) { return };

public static Integer division(final Integer val, final Integer val2) { return val / val2; }

public static Double division(final Double val, final Double val2) { return val / val2; }

public static BigDecimal division(final BigDecimal val, final BigDecimal val2) {return val.divide(val2, 2, RoundingMode.HALF_DOWN);
