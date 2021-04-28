import static java.lang.System.out;

public class Firma {
    public static void main(String[] args) {

        Kierownik k1 = new Kierownik("Karol", "Nowak", 4100);
        k1.setBonus(500);

        Pracownik[] company = new Pracownik[4];

        company[0] = new Pracownik(k1); //użycie konstruktora jednoparametrowego
        company[1] = new Pracownik("Artur", "Kowalski", 3500); //użycie konstruktora 3-parametrowego
        company[2] = new Pracownik("Wiktor", "Kowal", 3400);
        company[3] = new Pracownik("Alojzy", "Ignaczak", 3900);

        for(int i = 0; i <= 3; ++i){
            System.out.println("Imię: " + company[i].getName() + ", nazwisko: " + company[i].getSurname() + ", pensja: " + company[i].getSalary());
        }

        company[2].salaryRise(100);

        System.out.println("Imię: " + company[2].getName() + ", nazwisko: " + company[2].getSurname() + ", pensja: " + company[2].getSalary());

        Kierownik k2 = new Kierownik(); // użycie konstruktora bezparametrowego (domyślnego) w klasie pochodnej
    }
}


/*

--- Pytanie 1 ---
Wywołać konstruktory (parametrowe i domyślne) w klasach pochodnych

W kodzie zostały zaznaczone miejsca, w których wywołano poszczególne wywołania





--- Pytanie 2 ---
Jaki jest efekt gdy w klasie potomnej w konstruktorze brakuje super

Jeżeli w klasie potomnej brakuje słowa "super", nie zostaje wywołany konstruktor klasy nadrzędnej.
Tym samym wartości przekazane jako parametry konstruktora, nie zostają przypisane do obiektu.
Dodatkowo instrukcja super() musi być pierwszą instrukcją w konstruktorze.
W innym wypadku otrzymamy błąd Constructor call must be the first statement in a constructor




--- Pytanie 3 ---
Po czym dziedziczy klasa, która nie wykorzystuje extends

Każda klasa domyślnie dziedziczy po klasie java.lang.Object (chyba, że zdefiniujesz inną klasę po której dziedziczysz).
Dzięki tej klasie masz dostęp do zestawu metod, które zdefiniowane są w ciele klasy Object.
Na przykład metoda String toString() ma swoją podstawową implementację w klasie Object1.

 */