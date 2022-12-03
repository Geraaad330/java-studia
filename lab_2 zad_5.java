import java.util.Locale;
import java.util.Scanner;

/*Zadanie 5. Należy napisać metodę w klasie Algorytm i program obliczający rozwiązanie układu równań
liniowy 2×2 wykorzystujący metodę wyznacznikową dla macierzy dwu wymiarowych.
{𝑎11𝑥1+𝑎12𝑥2=𝑏1
𝑎21𝑥1+𝑎22𝑥2=𝑏2
*/


public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale("pl","PL");
        Scanner in = new Scanner(System.in);

        System.out.println("Rywnania liniowe mają postać:\na11x1 + a12x2 = b1\na21x1 + a22x2 = b2");
        System.out.println("Podaj od lewej po kolei a11, a12, a21, a22, b1, b2");

        double a11 = in.nextDouble();
        double a12 = in.nextDouble();
        double a21 = in.nextDouble();
        double a22 = in.nextDouble();
        double b1 = in.nextDouble();
        double b2 = in.nextDouble();

        double w = a11*a22-a21*a12;
        double wx = b1*a22-a12*b2;
        double wy = a11*b2-a21*b1;

        double x = wx/w;
        double y = wy/w;

        System.out.printf(locale, "x=%g, y=%g", x,y);
    }
}