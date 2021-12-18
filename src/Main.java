import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */
        System.out.println("Zadanie 1:");
        System.out.println("Podpunkt a:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę wpisać dowolną liczbę: ");
        int userNumber = scanner.nextInt();
        switch(userNumber % 2){
            case 0:
                System.out.println("Liczba " + userNumber + " jest parzysta.");
                break;
            default:
                System.out.println("Liczba " + userNumber + " nie jest parzysta.");
                break;
        }
        System.out.println("\nPodpunkt b:");
        System.out.println("Proszę wpisać dowolną liczbę: ");
        int userNumber2 = scanner.nextInt();
        switch (userNumber2 % 7){
            case 0:
                System.out.println("Liczba " + userNumber2 + " jest podzielna przez 7.");
                break;
            default:
                System.out.println("Liczba " + userNumber2 + " nie jest podzielna przez 7.");
                break;
        }
        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */
        System.out.println("\nZadanie 2:");
        String text = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int[] arr1 = {0, 0, 0, 0, 0, 0};
        for (char varChar : text.toCharArray()){
            switch(varChar){
                case 'o':
                    ++arr1[0];
                    break;
                case 'p':
                    ++arr1[1];
                    break;
                case 'x':
                    ++arr1[2];
                    break;
                case 'z':
                    ++arr1[3];
                    break;
                case 'q':
                    ++arr1[4];
                    break;
                default:
                    ++arr1[5];
                    break;
            }
        }
        System.out.printf("\nLiczba występuje:\no: %d  razy\np: %d razy\nx: %d razy\nz: %d razy\nq: %d razy\npozostałych: %d razy",
                arr1[0], arr1[1], arr1[2], arr1[3], arr1[4], arr1[5]);
    }
}
