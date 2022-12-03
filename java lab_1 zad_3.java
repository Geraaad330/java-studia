import java.util.Locale;
import java.util.Scanner;

/* Zadanie 3. Napisać program pobierający dwie liczby rzeczywiste z klawiatury, a następnie wykonuje
*  na nich takie działania arytmetyczne, jak: dodawanie, odejmowanie, mnożenie i dzielenie.
*  Wynik tych działań wypisuje na ekran konsoli. Jak zareaguje, gdy dokonamy dzielenia przez zero?
*/



public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale ("pl", "PL");
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj dwie liczby oddzielone spacją");

        // liczby mozna wprowadzać bezpośrednio jedna po drugiej (spacja po pierwszej liczbie)
        // lub
        // liczby mozna wprowadzić wprowadzając enter po pierwszej liczbie (druga w nowej linii)

        int liczba1 = in.nextInt();
        int liczba2 = in.nextInt();

        System.out.println("Pierwsza liczba to: " + liczba1);
        System.out.println("Druga liczba to: " + liczba2);

        /* wprowadzanie tekstu
        in.nextLine();
        String s1 = in.nextLine();
        System.out.println(s1);
        */

        System.out.println("Wynik dodawania: " + (liczba1 + liczba2));
        System.out.println("Wynik odejmowania: " + (liczba1 - liczba2));
        System.out.println("Wynik mnożenia: " + (liczba1 * liczba2));
        System.out.println("Wynik dzielenia: " + (liczba1 / liczba2));

        /*przy wykonywaniu działań arytmetycznych zmienne int muszą byc wewnatrz nawiasów*/
    }
}