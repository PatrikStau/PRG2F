import java.util.Scanner;

public class Metody_cv {
    static double obvodTelesa(){
        int a = 10;
        int b = 2;
        double c = Math.PI;
        double obvod = c * a * b;
        return obvod;
    }

    static int nactiCislo(int a){
        a += 15;
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej celé číslo.");
        int vstup = sc.nextInt();
        return vstup;
    }

    static void print(String zprava){
        System.out.println(zprava);
    }
    static double sum(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
//        System.out.println(obvodTelesa());


//        int vstup1 = nactiCislo(11);
//        int vstup2 = nactiCislo(20);
//        System.out.println(vstup1 + vstup2);
//
//        print("Ahoj Metoději.");

        double vysledek = sum(5.6, 4.2);
        System.out.println(vysledek);


    }
}
