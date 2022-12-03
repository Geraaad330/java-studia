import java.util.Locale;
import java.util.Scanner;

/*
* Zadanie 1. Napisz program, który będzie wykonywał dodawanie i dzielenie dwóch liczb rzeczywistych
* wczytanych z klawiatury dokonujący sprawdzenia, czy mianownik nie równy zero.
a) Co się stanie gdy, liczba przez, którą dzielimy będzie bliska zera, licznik bardzo dużą liczbą?
b) Co się stanie gdy do jedności dodamy liczbę małą np. 1e-20?
* */

public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale("pl", "PL");
        Scanner in = new Scanner(System.in);
        double a = 2;
        double b = 3;
        System.out.printf(locale, "pierwsza liczba to %g\ndruga liczba to %g\n\n", a,b);

        System.out.println("Podaj dwie licbzy: ");

        try {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = x/y;

            System.out.printf(locale, "Wynik dodawania to: %g\nWynik dzielenia to: %g", x+y, z);
        }
        catch (ArithmeticException e) {
            System.out.println("wyjatek ArithmeticException " + e);
        }

        catch (Exception e) {
            System.out.println("wyjątek Exception " + e);
        } // wyjątek Exception obsługuje wyjątek ArithmeicException
          // ale to ArithmeticException jest pierwszy więc to on złapie błąd

        System.out.println("\nKod poniżej Exception wykona sie pomimo napotkania błędu");


    }

}