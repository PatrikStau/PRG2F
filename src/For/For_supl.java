package For;

public class For_supl {
    public static void main(String[] args) {
        for (int i = 20; i >= 0; i -= 2) {
            System.out.println(i);
        }
        int radky = 4;
        int sloupce = 3;
        int cislo = 1;

        System.out.println("Toto je příklad na cyklus \"FOR\"");

        for (int i = 1; i <= radky ; i++) {
            for (int j = 1; j <= sloupce; j++) {
                System.out.print(cislo++ + "\t");
            }
            System.out.println();
        }
    }
}
