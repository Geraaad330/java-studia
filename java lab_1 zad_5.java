/*Zadanie 5. Należy napisać program zamieniający kąt podany w stopniach na kąt w radianach.*/

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale("pl", "PL");
        Scanner in = new Scanner(System.in);

        System.out.println("Program zamienia kąt podany w stopniach na kat w radianach");
        System.out.println("Podaj wartość kąta w stopniach");
        Double stopnie = in.nextDouble();
        System.out.println("\nZamiana kąta: " + stopnie + " na kat w radianach to: " + ((stopnie * 3.14159265359) / 180));

    }
}