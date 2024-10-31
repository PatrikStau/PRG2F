package For;

import java.util.Random;
import java.util.Scanner;

public class For_cv {
    public static void main(String[] args) {

//        načtěte od uživatele kladné celé číslo n
//        vypište součet čísel od 1 do n

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Zadejte číslo.");
//        int n = sc.nextInt();
//        int soucet = 0;
//        for (int i = 1; i <= n; i++) {
//            soucet = soucet + i;
//        }
//        System.out.println("Součet je: " +soucet);
//
////        Mějme funkci y = 2x - 3
////        A celočíselné hodnoty x od -50 do 50
////        vypište hodnoty funkce všech bodů z rozsahu x
//
//        int a = sc.nextInt();
//        int faktorial = 1;
//        for (int i = a; i >= 1 ; i--) {
//            faktorial *= i;
//        }
//        System.out.println("Faktoriál " + a + " je: " + faktorial);


//        int dead = 13;
//        Random rng = new Random();
//        int hod = -1;
//        int pocetsmrti = 0;
//        int pocethodu = 100;
//        for (int i = 1; i <= pocethodu; i++) {
//            hod = rng.nextInt(1,21);
//            if (hod == dead) {
//                System.out.println("Umřel jsi.");
//                pocetsmrti++;
//            }
//            else {
//                System.out.println("Žiješ.");
//            }
//        }
//        System.out.println("Umřel jsi: " +pocetsmrti + "krát");
//        System.out.println("Smrt v procentech " + (pocetsmrti * 100.0) / pocethodu);

        int panna = 1;
        int orel = 2;
        Random rng = new Random();
        int hod = -1;
        int pocetpann = 0;
        int pocetorlu = 0;
        int pocethodu = 1000000;
        for (int i = 1; i <= pocethodu; i++) {
            hod = rng.nextInt(2);
            if (hod == panna) {
                System.out.println("Hodil jsi pannu.");
                pocetpann++;
            } else {
                System.out.println("Hodil jsi orla.");
                pocetorlu++;
            }
        }
        System.out.println("Pannu jsi hodil: " + pocetpann + " krát");
        System.out.println("Panna v procentech " + ((pocetpann * 100.0) / pocethodu) + " %");
        System.out.println("Orla jsi hodil: " + pocetorlu + " krát");
        System.out.println("Orel v procentech " + ((pocetorlu * 100.0) / pocethodu) + " %");

    }
}
