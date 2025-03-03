import java.util.Scanner;

public class procvicovani_TestMetody {
    static int sectiCisla(int a, int b){
        int vysledek = a + b;
        return vysledek;
    }

//    static int kontrolaCisla(int a){
//        if (a % 2 == 0){
//            System.out.println("Číslo je sudé.");
//        } else {
//            System.out.println("Číslo je liché.");
//        }
//    }

    static String napisZpravu(String jmeno){
        jmeno = "Patrik";
        String zprava = "Hello " + jmeno;
        System.out.println(zprava);
        return zprava;
    }

    public static void main(String[] args) {
        int vysledek = sectiCisla(4,9);
        System.out.println(vysledek);

        //kontrolaCisla(5);
        Scanner sc = new Scanner(System.in);
        napisZpravu("Patrik");

    }
}
