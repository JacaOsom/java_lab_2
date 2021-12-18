public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
        System.out.println("Zadanie 1:\n");
        int number = 1000;
        int index = 56;  //wybrałem początek mojego indeksu (cały: 56701).
        do {
                if (number % index == 0){
                    System.out.println("Liczba " + number + " jest podzielna przez " + index);
                }
            number--;
        }while(number != 0);

        System.out.println("\nZadanie 2:\n");
        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
        System.out.println("Podpunkt a:");
        int[] arr1 = {10, 30, 100, 55, 23};
        int a = 0;
        while(a < arr1.length){
            System.out.print(arr1[a] + ", ");
           a++;
        }
        System.out.println("\nPodpunkt b:");
        double[] arr2 = {10.5, 12.5, 351.31247, 1.121354, 54867.222};
        int b = 0;
        while (b < arr2.length){
            System.out.print(arr2[b] + ", ");
            b++;
        }
        System.out.println("\nPodpunkt c:");
        String[] text = new String[]{"Mamy", "dzsiaj", "zajęcia", "do", "18"};
        int c = 0;
        while (c < 5){
            System.out.print(text[c] + " ");
            c++;
        }
        System.out.println("");
        System.out.println("\nZadanie 3:\n");
        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */
        System.out.println("Podpunkt a:");
        int[] arr3 = {1, 2, 3, 4, 5};
        int d = 0;
        while(true){  //wyrzuci wyjątek ArrayIndexOutOfBoundsException
            System.out.println(arr3[d]);
            d++;
        }
        // w przypadku false nie da się wyświetlić tablicy, pokazuje błąd "Unreachable statement".
    }
}
