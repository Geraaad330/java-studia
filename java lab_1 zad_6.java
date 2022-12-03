import java.util.Locale;
import java.util.Scanner;

/*
* Zadanie 6.Napisz program obliczający wartości wielomianu 𝐴(𝑥)=𝑎𝑥2+𝑏𝑥+𝑐 oraz 𝐵(𝑥)=𝑎𝑥3+𝑏𝑥2+𝑐𝑥+𝑑 dla
* pobranej z klawiatury liczby 𝑥 oraz zadanych w kodzie programu współczynników 𝑎, 𝑏, 𝑐 i 𝑑.
* Wynik tych działań program wypisuje na ekranie konsoli.
* */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale locale = new Locale("pl", "PL");

        System.out.println("Program oblicza: \nA(x)=ax^2 + bx +c \nB(x)=ax^3 + bx^2 + cx + d");
        System.out.println("Podaj x: ");
        Double x = in.nextDouble();

        int a = 3;
        int b = 2;
        double c = 5.2134;
        double d = 2.9422;

        double Ax = a*x*x + b*x + c;
        double Bx = a*x*x*x + b*x*x + c*x + d;

        System.out.println("A(x) = " + Ax);
        System.out.println("B(x) = " + Bx);

    }
}