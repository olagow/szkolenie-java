package pl.cyber.trainees.wyjasnienia;

/*Utowrzyć Bankomat

        Do wykonania prosta obsługa bankomatu.
        1) Dzięki użyciu instrukcji warunkowej musimy zaimplementować menu wyboru opcji:
        a) wpłać gotówkę
        b) wypłać gotówkę
        c) sprawdzenie stanu konta
        d) przerwij operację

        2) Należy wykonać kod aplikacji dla wszystkich opcji.
        Aplikacja powinna wyświetlać menu do momentu, gdy nie wybierzemy opcji 'przerwij operację', wtedy aplikacja powinna przestać działać.
        3) Początkowy stan konta bankomatu powinien wynosić 0, jednocześnie możemy wpłacać na stan konta wyłącznie następujące liczby (10, 20, 50, 100, 200, 500)
        4) Wypłacać gotówkę możemy wyłącznie następujące liczby (10, 20, 50, 100, 200, 500), jeśli wypłata gotówki ma przekroczyć minimalny stan konta powinien zostać wyświetlony
        wyjątek StanKontaException z opisem "Niewystarczająca ilość środków w bankomacie"
        5) Sprawdzenie stanu konta powinno zwrócić ilość gotówki zdeponowanej w bankomacie.
        6) Po wykonaniu opcji a - c powinna aplikacja wrócić do menu.



        Dla chętnych.
        Algorytm można rozszerzyć o 2 karty bankomatowe każda ze swoim stanem konta.
        Dostępne menu wyboru:
        a) wpłać gotówkę
        b) wypłać gotówkę
        c) sprawdzenie stanu konta
        d) sprawdzenie stanu konta karty
        e) przerwij operację

        Przy wpłacie, wypłacie gotówki oraz sprawdzeniu stanu konta karty powinna być weryfikacja czy podany nr karty oraz pin jest zgodny.
        Jeśli jest on niezgodny powinien zostać wyświetlony wyjątek KartaException z komunikatem "Pin do karty jest niezgodny"
        Wypłata gotówki powinna sprawdzać minimalny stan konta bankomatu oraz karty (0) jeśli miałaby kwota wypłaty przekroczyć ten stan, powinien zostać zgłoszony wyjątek
        StanKontaException z opisem "Niewystarczająca ilość środków"
        Sprawdzenie stanu konta karty powinna zwrócić gotówkę w ramach danej karty.
        Pozostałe funkcjonalności zgodnie z opisem wyżej.*/

public class Bankomat {

    public void bankomat{
        if ("Wybierz karte");






    }



}
