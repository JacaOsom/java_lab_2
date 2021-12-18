import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */
        //a:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadanie 1:");
        List<String> stringList = new ArrayList<String>();
        String nazwaZwierzecia;
        for (int i = 0; i < 5; i++){
            System.out.print("Podaj nazwę " + (i+1) + " zwierzęcia: ");
            nazwaZwierzecia = scanner.nextLine();
            stringList.add(nazwaZwierzecia);
        }
        System.out.println("\nOtrzymane zwierzęta:");
        wystwietlNazwyZwierzat(stringList);
        //c
        stringList.remove(4);
        stringList.remove(3);
        System.out.println("\nOtrzymane zwierzęta po usunięciu:");
        wystwietlNazwyZwierzat(stringList);
        System.out.println("\nOtrzymany rozmiar listy po usunięciu: " + stringList.size());
        //d
        Collections.sort(stringList, Collections.reverseOrder());
        System.out.println("\nSortowanie odwrotne: ");
        wystwietlNazwyZwierzat(stringList);

         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */
        System.out.println("\n");
        System.out.println("zadanie 2:");
        List<Integer> liczby = new ArrayList<>();
        int liczba;
        for (int j = 0; j < 10; j++){
            System.out.print("Wprowadź liczbę: ");
            liczba = scanner.nextInt();
            liczby.add(liczba);
        }
        Collections.sort(liczby);
        System.out.println("Liczby: " + liczby);
        Set<Integer> liczby2 = new TreeSet<>(liczby);
        System.out.println("Liczby set: " + liczby2);

        for (Integer numbers : liczby2) {
            System.out.print(numbers + ", ");
        }

    }
    //zadanie 1
    //b
    public static void wystwietlNazwyZwierzat(List<String> stringList){
        for (String nazwa : stringList) {
            System.out.print(nazwa + ", ");
        }
    }

}
