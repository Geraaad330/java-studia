/* Zadanie 4. Napisz program, który pyta o promień koła, a następnie drukuje jego powierzchnię */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale locale = new Locale("pl", "PL");

        System.out.println("Program oblicza pole koła");
        System.out.println("Podaj promień koła: ");
        double r = in.nextDouble();
        System.out.println("Pole koła wynosi: " + (3.14159265359 * r * r));

    }
}