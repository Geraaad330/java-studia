import java.util.Locale;
import java.util.Scanner;

/*
* Zadanie 6.Napisz program obliczajฤcy wartoลci wielomianu ๐ด(๐ฅ)=๐๐ฅ2+๐๐ฅ+๐ oraz ๐ต(๐ฅ)=๐๐ฅ3+๐๐ฅ2+๐๐ฅ+๐ dla
* pobranej z klawiatury liczby ๐ฅ oraz zadanych w kodzie programu wspรณลczynnikรณw ๐, ๐, ๐ i ๐.
* Wynik tych dziaลaล program wypisuje na ekranie konsoli.
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