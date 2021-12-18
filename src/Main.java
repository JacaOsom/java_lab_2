import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */
        System.out.println("Zadanie 1");
        int index = 7; //indeks = 56701 - wybrałem 7
        for (int i = 100; i > 0; i--){
            if (i % index == 0){
                System.out.println("Liczba " + i + " jest podzielna przez " + index);
            }
        }

        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */
        System.out.println("\nZadanie 2:");
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++){
            System.out.print("Wpisz " + (i+1) + " liczbę: ");
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Wpisane liczby powiększone o 11:");
        for (int numbers : arr1) {
            System.out.print((numbers + 11) + ", ");
        }
    }
}
