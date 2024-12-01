package For;

public class For_obrazce {
    public static void main(String[] args) {

        int velikostMrizky = 5;

        for (int radek = 0; radek < velikostMrizky; radek++) {
            for (int sloupec = 0; sloupec < velikostMrizky; sloupec++) {
                if (radek == 0 || radek == velikostMrizky - 1 || radek == (velikostMrizky - 1) - sloupec) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" ■ ");
                }

            }
            System.out.println();

        }
        System.out.println();

        for (int radek = 0; radek < velikostMrizky; radek++) {
            for (int sloupec = 0; sloupec < velikostMrizky; sloupec++) {
                if (radek == 0 || radek == velikostMrizky - 1 || sloupec == 0 || sloupec == velikostMrizky - 1) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" ■ ");
                }

            }
            System.out.println();
        }
    }
}