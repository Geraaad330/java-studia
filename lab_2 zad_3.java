import java.util.Locale;
import java.util.Scanner;

/*Zadanie 3. Napisz program obliczający pole powierzchni bocznej i objętość walca, który będzie
sprawdzał czy użytkownik podał poprawnie promień i wysokość.*/

class Algorytm{
    public double obliczenia (double r, double h) {

        try {
            if (r <= 0 || h <= 0) throw new ArithmeticException("r lub h nie może być mniejsze lub równe zero");
        }
        catch (ArithmeticException e) {
            throw e;
        }

        return 0;
    }
}


public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale("pl", "PL");
        Scanner in = new Scanner(System.in);

        System.out.println("program oblicza pole powierzchni bocznej i objętość walca");

        try {
            System.out.println("Podaj r: ");
            double r = in.nextDouble();

            System.out.println("Podaj h: ");
            double h = in.nextDouble();

            Algorytm at = new Algorytm();
            double wynik = at.obliczenia(r,h);

            double Pp = 3.14159265359 * r*r;
            double Pb = 2 * 3.14159265359 * r*h;
            double V = Pp * h;

            System.out.printf("Objętość walca to: %g\nPole powierzchni bocznej to: %g", V,Pb);


        }


        catch (ArithmeticException ex1) {
            System.out.println(ex1.getMessage());
        }

        catch (Exception ex) {
            System.out.println(ex.getMessage());
            }

        System.out.println("\nKod poniżej Exception wykona sie pomimo napotkania błędu\nW bloku try juz nic nie moze sie wykonać");

        }
    }
