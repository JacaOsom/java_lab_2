public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */
        System.out.println("Zadanie 1:");
        System.out.println("Podpunkt a:");
        for(int i = 0; i < 10; i++){
            if (i == 3){
                break;
            }
            System.out.print(i + ", ");  // pętla kończy swój działanie, gdy licznik wyniesie 3.
        }
        System.out.println("\n");
        System.out.println("Podpunkt b:");
        for (int j = 0; j < 10; j++){
            if (j % 2 == 0){
                continue;
            }
            System.out.print(j + ", ");  //gdy w pętli reszta z dzielenia wyjdzie 0 program pomija to działanie, wykonuje następne i wypisuje
        }
        System.out.println("\n");
        System.out.println("Podpunkt c:");
        for (int k = 0; k < 10; k++){
            if (k == 5){
                return;
            }
            System.out.print(k + ", ");  //return działa podobnie jak break, przerywa w momencie jego wywołania,
                                        // ale jeżeli jest metoda w kodzie to ona również zostanie przerwana.
        }
    }
}
