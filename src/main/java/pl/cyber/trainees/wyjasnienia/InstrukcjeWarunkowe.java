package pl.cyber.trainees.wyjasnienia;

public class InstrukcjeWarunkowe {

    public void uruchom() {
//        wyswietlSwitch(6);
//        wyswietlOd1Do50();
//        jakaPlec(Plec.KOBIETA);
//        jakaPlec(Plec.MEZCZYZNA);
//        jakaPlec(Plec.INNA);


//        jakaPlec("mężczyzna");
        jakaPlec2("mezczyzna");

    }

    /*
Instrukcja warunkowa if

BUDOWA if'a

CONDITION (boolean) - inaczej warunek sprawdzający np i<0, a+b = 2, 2%2 = 0 itp.

if(CONDITION) {
 //pojawić się powinien kod jeśli warunek jest spełniony (true)
}

if(2+2 = 4) {
println("dodawanie równe 4");
}

else - potocznie w przeciwnym wypadku

if(CONDITION) {
 //pojawić się powinien kod jeśli warunek jest spełniony (true)
} else {
 //pojawić się powinien kod jeśli warunek nie został spełniony (false)
}

a+b = 4
if(2+2 = 4) {
println("dodawanie równe 4");
} else {
println("dodawanie nie równe 4");
}

if(CONDITION) {
 //pojawić się powinien kod jeśli warunek jest spełniony (true)
} else if(COUNDITION 2) {
 //pojawić się powinien kod jeśli warunek jest spełniony (true)
} else {
 //pojawić się powinien kod jeśli warunek nie został spełniony (false)
}

a+b = 4
if(2+2 = 4) {<- zostanie wyświetlone
println("dodawanie równe 4");
} else if(2+1 = 3) {
println("dodawanie równe 3");
 } else {
println("dodawanie nie równe 4");
}


a+b = 4
if(2+5 = 4) { <- false
println("dodawanie równe 4");
} else if(2+1 = 3) { <- true
println("dodawanie równe 3"); <- zostanie wyświetlone
 } else {
println("dodawanie nie równe 4");


a+b = 4
if(2+5 = 4) { <- false
println("dodawanie równe 4");
} else if(2+2 = 3) { <- false
println("dodawanie równe 3");
 } else {
println("dodawanie nie równe 4"); <- zostanie wyświetlone
}


 */

    //Utworzyć metodę, która zwróci true/false jeśli podana liczba w parametrze nie jest równa 10


    public boolean rowne10(Integer liczba) {
        // ! = -sprawdzenie czy liczba nie jest rowna innej liczbie
//
//            if (liczba != 10) {
//                return true;
//            } else {
//                return false;
//            }

        if (liczba == 10) {
            return true;
        } else {
            return false;
        }
    }
/*
  SWITCH



  switch (condition) {
      case "1":  //  condition == "1"
        println("To jest poniedziałek");
        break;
      case "Poniedziałek":
        println("To jest poniedziałek");
        break;
      case "2":  //  condition == "2"
      println("To jest wtorek");
        break;
      case "Wtorek":  //  condition == "Wtorek"
      println("To jest wtorek");
        break;
        .
        .
        .
      default:
        println("b/d");

    }

    switch (condition) {
      case "1":  //  condition == "1"
      case "Poniedziałek":
        println("To jest poniedziałek");
        break;
      case "2":  //  condition == "2"
        break;
      case "Wtorek":  //  condition == "Wtorek"
        break;
        .
        .
        .
      default:
        println("b/d");

    }


    równoznaczne zapisy

      case "1":  //  condition == "1"
        println("To jest poniedziałek");
        break;
      case "Poniedziałek":
        println("To jest poniedziałek");
        brerównoznaczne zapisy

      case "1":  //  condition == "1"
        println("To jest poniedziałek");
        break;
      case "Poniedziałek":
        println("To jest poniedziałek");
        break;


     case "1":  //  condition == "1"
      case "Poniedziałek":
        println("To jest poniedziałek");
        break;


    if(conditon = 1 || conditon = "Poniedziałek") {
      println("To jest poniedziałek");
    }



    np.
    switch (zmienna) {
    case "ala":
        println("Tak");
        break;
    }


    switch - słowo kluczowe określające instrukcję warunkową
    (condition) zmienna warunkowa, którą będziemy badali
    ciało switch'a zawsze określamy poprzez nawiasy {}

    aby weryfikować zmienną warunkową musimy użyć 'case', inaczej przypadków, które oczekujemy

    przypadków do sprawdzania możemy użyć od 1 do n (przykłąd poniżej)

Ważene:
    Wartość case musi być stała lub literana. Nie możemy używać zmiennych

    Wszystkie wartości case muszą byc unikalne

    Każda instrukcja case może (ale nie musi) mieć instrukcję break.
    Jest ona opcjonalna. Gdy Java natrafi na instrukcję break, zakończy wykonanie instrukcji switch.
    Jeśli instrukcja break nie zostanie znaleziona, sprawadzany jest następny przypadek (następny case).


Przykład:
    np. weryfikacje wprowadzonego alfabetu jako konkretna litera alfabetu tj. a -> z
    np. weryfikacja wprowadzonych liczb od 1 do n

    switch (condition) {
        case 1:
          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
          break;
        case n:
          break;
        default:
    }

alternatywa powyższego w postaci if:
if(condition == 1) {
} else if(condition == 2) {

} else if(condition == 3) {

} else if(condition == 4) {

} else if(condition == n) {

} else {

}

switch(condition) {
  case x:
    // Blok kodu, jeśli wartość x zgadza się ze zmianną warunkową
    break;
  case y:
    // Blok kodu, j
    switch(condition) {
  case x:
    // Blok kodu, jeśli wartość x zgadza się ze zmianną warunkową
    break;
  case y:
    // Blok kodu, jeśli wartość y zgadza się ze zmianną warunkową
    break;
  default:
    // Blok kodu, gdy nie jest spełniony żaden z powyższych przypadków
}


 */

    //Zadanie -> utworzyć metodę, która ma podany (String,Integer) parametr wejsciowy wyswietli odpowiadajacy dzien tygodnia
    public void wyswietlSwitch(Integer jakiDzienTygodnia) {

        switch (jakiDzienTygodnia) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Nieprawidłowy dzień");

        }

    }

    /*

Zadanie Wykonać metodę która będzie iterować od 1 do 50 i wyświetli w konsoli odpowiednie napisy:

dla 0 → Wyświetlam zero
dla 5 → Wyświetlam 5
dla 10 → To jest 10
dla 30 → To jest liczba 30
dla 49 → To jest liczba 49
dla pozostałych → Wskazana liczba jest inna niż oczekiwana

     */

    public void wyswietlOd1Do50() {

        for (int i = 0; i <= 50; i++) {


            switch (i) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 5:
                    System.out.println("Wyświetlam 5");
                    break;
                case 10:
                    System.out.println("10");
                    break;
                case 30:
                    System.out.println("To");
                    System.out.println("jest");
                    System.out.println("liczba");
                    System.out.println("30");
                    break;
                case 49:
                    System.out.println("To");
                    System.out.println("jest");
                    System.out.println("liczba");
                    System.out.println("49");
                    break;

                default:
                    System.out.println("Wskazana liczba jest inna niż oczekiwana");
            }
        }

    }

    enum Plec {KOBIETA, MEZCZYZNA, INNA}

    private void jakaPlec(Plec plec) {
        //Dla KOBIETA wyświetlić Jestem Kobietą dla MEZCZYZNA wyświetlić Jestem mężczyzną
        //wykonać przy użyciu konstrukcji if a potem przez switch

        if (Plec.KOBIETA == plec) {
            System.out.println("Jestem Kobietą");
        } else if (Plec.MEZCZYZNA == plec) {
            System.out.println("Jestem Mężczyzną");
        } else {
            System.out.println("Nie rozumiem.");
        }

        switch (plec) {
            case KOBIETA:
                System.out.println("Jestem Kobietą");
                break;
            case MEZCZYZNA:
                System.out.println("Jestem Mężczyzną");
                break;
            default:
                System.out.println("Nie rozumiem.");
        }
    }




    private void jakaPlec(String plec) {

        if ("KOBIETA".equals(plec) || "kobieta".equals(plec) || "Kobieta".equals(plec)) {
            System.out.println("Jestem Kobietą");
        } else if ("MEZCZYZNA".equals(plec) || "mezczyzna".equals(plec) || "Mezczyzna".equals(plec)) {
            System.out.println("Jestem Mężczyzną");
        } else {
            System.out.println("Nie rozumiem.");
        }

        switch (plec) {
            case "KOBIETA":
                System.out.println("Jestem Kobietą");
                break;
            case "kobieta":
                System.out.println("Jestem Kobietą");
                break;
            case "Kobieta":
                System.out.println("Jestem Kobietą");
                break;
            case "MEZCZYZNA":
            case "mezczyzna":
            case "Mezczyzna":
                System.out.println("Jestem Mężczyzną");
                break;
            default:
                System.out.println("Nie rozumiem.");
        }
    }

    //plec.toUpperCase().equals("KOBIETA")  // takie sprawdzenie warunku może zwrócić błąd typu NullPointerException
    // w przypadku gdy zmienna plec będzie równa null, ponieważ metoda toUpperCase() prawidłowo nie rozpoznaje z null'a wartości stringowej
    //Aby się przed takim błędem zabezpieczyć warto pisać warunki od rzeczy, które znamy do tych których nie znamy.
    //tzn jeśli sprawdzamy jakiś Literał/napis/enum to najpierw podajemy wartośc literału/napisu/enuma a następnie wartość naszej zmiennej.
    //przykład
    //"KOBIETA".equals(plec.toUpperCase())

    private void jakaPlec2(String plec) {

        if ("KOBIETA".equals(plec.toUpperCase())) {
            System.out.println("Jestem Kobietą");
        } else if ("MEZCZYZNA".equals(plec.toUpperCase())) {
            System.out.println("Jestem Mężczyzną");
        } else {
            System.out.println("Nie rozumiem.");
        }

        switch (plec.toUpperCase()) {
            case "KOBIETA":
                System.out.println("Jestem Kobietą");
                break;
            case "MEZCZYZNA":
                System.out.println("Jestem Mężczyzną");
                break;
            default:
                System.out.println("Nie rozumiem.");
        }

    }
}