import java.util.Locale;
import java.util.Scanner;

/*
* Zadanie 8. Napisz program obliczający pole powierzchni bocznej i objętość walca.
* */

public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale("pl", "PL");
        Scanner in = new Scanner(System.in);

        System.out.println("Program oblicza pole powierzchni bocznej i objętość walca.");
        System.out.println("Podaj r: ");
        double r = in.nextDouble();
        System.out.println("Podaj h: ");
        double h = in.nextDouble();
        double Pp = 3.14159265359 * r*r;
        double Pb = 2 * 3.14159265359 * r * h;
        double V = Pp * h;

        System.out.println("Pole podstawy = " + Pp + "\nPole powierzchni bocznej = " + Pb + "\nObjetość = " + V);
    }
}