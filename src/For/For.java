package For;

public class For {
    public static void main(String[] args) {
        /* Vypište všechny násobky pěti  od 0 do 1000 */

//        for (int i = 0; i <= 1000; i+= 5) {
//            System.out.println(i);
//        }
//
//        /* Vypište všechny čísla od 100 do 0 */
//
//        for (int i = 100; i >= 0; i--) {
//            System.out.println(i);
//        }

        /* upravte předchozí příklad tak aby vypisoval 2 mocniny čísel */

//        for (int i = 100; i >= 0; i--) {
//            System.out.println(i*i);
//        }

        /* vypsat malou násobilku */


        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

    }
}

