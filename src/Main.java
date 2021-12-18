import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */
        System.out.println("Zadanie 1:");
        int[] tab1 = new int[20]; //a
        uzupelnienieTablicy1(tab1); //d
        wypiszTablice1(tab1);

        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */
        System.out.println("\n");
        System.out.println("Zadanie 2:");
        String[] text1 = new String[6]; //a
        uzupelnienieTablicy2(text1);
        wypiszTablice2odKonca(text1);
        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */
        System.out.println("\n");
        System.out.println("Zadanie 3:");
        String imie = "Jacek";
        metoda1(imie);
        String nazwisko = "Filipski";
        metoda1(imie, nazwisko);
        int wiek = 26;
        metoda1(imie, nazwisko, wiek);

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */
        System.out.println("\n");
        System.out.println("Zadanie 4:");
        int suma = sumujLiczby(5, 21);
        System.out.println("Suma: " + suma);
        int suma2 = sumujLiczby(10, 11, 18);
        System.out.println("Suma druga: " + suma2);
        System.out.println("Suma dwóch metod:");
        System.out.print("wynik: " + (sumujLiczby(5, 21) + sumujLiczby(10, 11, 18)));

    }
    //zadanie 1
    //b
    public static void uzupelnienieTablicy1(int[] tab1){
        int liczba = 40;
        for (int i = 0; i < tab1.length; i++){
            tab1[i] = liczba;
            liczba--;
        }
    }
    //c
    public static void wypiszTablice1(int[] tab1){
        for (int liczby : tab1){
            System.out.print(liczby + ", ");
        }
    }
    //zadanie 2
    //b
    public static void uzupelnienieTablicy2(String[] text1){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < text1.length; i++){
            System.out.println("Podaj " + (i+1) + " wyraz:");
            text1[i] = scanner.nextLine();
        }
    }
    //c
    public static void wypiszTablice2odKonca(String[] text1){
        System.out.println("Otrzymana tablica od końca:");
        for (int i = text1.length - 1; i >= 0; i--){
            System.out.print(text1[i] + ", ");
        }
    }
    //zadanie 3
    //a
    public static void metoda1(String imie){
        System.out.println("Imię: " + imie);
    }
    //b
    public static void metoda1(String imie, String nazwisko){
        System.out.println("Imię: " + imie + " Nazwisko: " + nazwisko);
    }
    //c
    public static void metoda1(String imie, String nazwisko, int wiek){
        System.out.println("Imię: " + imie + " Nazwisko: " + nazwisko + " Wiek: " + wiek);
    }
    //zadanie 4
    //a
    public static int sumujLiczby(int zmiennaA, int zmiennnaB){
        return zmiennaA + zmiennnaB;
    }
    //b
    public static int sumujLiczby(int zmiennaA, int zmiennnaB, int zmiennaC){
        return zmiennaA + zmiennnaB + zmiennaC;
    }

}
