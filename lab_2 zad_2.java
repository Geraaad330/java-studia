
/*Zadanie 2. Należy napisać program obliczający współrzędne punku przecięcia się
funkcji liniowej 𝑦=𝑎𝑥+𝑏, 𝑎≠0 z osią 𝑂𝑋. Program sprawdza poprawność danych wprowadzonych
przez użytkownika.*/

import java.util.Locale;
import java.util.Scanner;

class Algorytm{
    public int aZero(int a) {

        try {
            if (a==0) throw new ArithmeticException("Exception. a nie może być zerem");
        }
        catch (ArithmeticException e) {
            throw e;
        }
        return a;
    }
}


public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale("pl", "PL");
        Scanner in = new Scanner(System.in);

    try {
        System.out.println("Równanie liniowe ma postać y=ax+b");
        System.out.println("Podaj współczynnik kierunkowy a: ");
        int a = in.nextInt();

        Algorytm at = new Algorytm();
        double c = at.aZero(a);

        System.out.println("podaj wyraz wolny b: ");
        int b = in.nextInt();

        System.out.println("Punky przeciecia z osią OX to: " + (-(b / a)));
    }

    catch(ArithmeticException ex) {
        System.out.println("ArithmeticException a=0");
    }
    catch(Exception ex) {
        System.out.println("Exception. Huj wie co");
    }

    }
}