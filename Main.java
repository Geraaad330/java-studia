import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Odczyt{
    public static void main(String[] args){
        int tab[] = {1,2,3,4,5};
        BufferedReader odczyt = new BufferedReader(new InputStreamReader(System.in));
        int index = -1;

        System.out.println("Który element tablicy chcesz zobaczyć: ");
        boolean czyPoprawne = false;

        while(!czyPoprawne) {
            try {
                index = Integer.parseInt(odczyt.readLine());
            } catch (NumberFormatException n) { System.out.println("Niepoprawne dane! " +
                    "\n Który element tablicy chcesz zobaczyć: ");
            } catch (IOException e) { System.out.println("Błąd odczytu danych");
            }

            czyPoprawne = index == -1? false : true;
        }

        try {
            System.out.println(tab[index-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Niepoprawny parametr, rozmiar tablicy to: "+tab.length);
        }
    }
}

/*
* n, e to po prostu nazwy wyjątku jaki przechwytujemy. Zapis catch (ArrayIndexOutOfBoundsException e)
* pozwala nam na przechwycenie wyjątku ArrayIndexOutOfBounds, a e to zmienna tego typu,
* która pozwoli nam wyświetlić informacje o nim. Co do drugiego pytania - faktycznie nie napisałem o
* tym w lekcjach, będę musiał uzupełnić. Tutaj jest napisane co to takiego: h
* ttp://javastart.pl/efektywne-programowanie/javatraps-002/ w skrócie, "jeśli index wynosi -1, to
* przypisz do zmiennej czyPoprawny wartość false, w innym przypadku przypisz wartość true".
*
*
* */