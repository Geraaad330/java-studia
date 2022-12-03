import java.util.Locale;
import java.util.Scanner;

/*Zadanie 4. Program znajduje rozwiązanie pierwiastki kwadratowego 𝑎𝑥2+𝑏𝑥+𝑐,
należy zabezpieczyć go przed podaniem przez użytkownika wartości współczynnika
redukującej równanie kwadratowe do równania liniowego.*/

class Algorytm{
    public double A0 (double a){
        try {
            if (a==0) throw new ArithmeticException("a nie może byc zerem");
        }
        catch (ArithmeticException e){
            throw e;
        }
        return 0;
    }
}

class Algorytm1{
    public double A1 (double delta){
        try {
            if (delta <= 0) throw new ArithmeticException("delta jest ujemna");
        }
        catch (ArithmeticException f){
            throw f;
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale("pl", "PL");
        Scanner in = new Scanner(System.in);

        System.out.println("Program znajduje rozwiązanie pierwiastki kwadratowego");
        System.out.println("Podaj a, b oraz c: ");

        try {
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();

            Algorytm at = new Algorytm();
            double z1 = at.A0(a);

            double delta = b * b - 4 * a * c;
            Algorytm1 at1 = new Algorytm1();
            double z2 = at1.A1(delta);

            double pDelta = Math.abs(delta);

            double x1 = (-b - pDelta) / 2 * a;
            double x2 = (-b + pDelta) / 2 * a;

            System.out.printf(locale, "x1 = %g\n", x1);
            System.out.printf(locale, "x2 = %g", x2);

        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception fx) {
            System.out.println(fx.getMessage());
        }

        System.out.println("\nKod poniżej Exception wykona sie pomimo napotkania błędu\nW bloku try juz nic nie moze sie wykonać");


    }
}