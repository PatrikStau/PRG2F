public class Test_metody_pole {
    //úkol 1
    public static double square(double cislo){
        return cislo * cislo;
    }

    //úkol 2
    public static void swap(int[] pole, int pos1, int pos2){

    }

    //úkol 3
    public static void squareAll(double[] pole){
        for (int i = 0; i < pole.length; i++) {
            System.out.println(pole[i] * pole[i]);
        }
    }

    public static void main(String[] args) {
        double vysledek = square(4.5);
        System.out.println(vysledek);
        squareAll(new double[]{2.5, 3.0, 4.5});

    }
}
