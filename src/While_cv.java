import java.util.Scanner;

public class While_cv {
    public static void main(String[] args) {

        // Napište program, který bude od uživatele načítat čísla, dokud nezadá číslo 0.
        // Program by měl poté vypočítat a vypsat součet všech zadaných čísel.

//        Scanner sc = new Scanner(System.in);
//        int cislo;
//        int soucet = 0;
//        do {
//            System.out.println("Zadej číslo.");
//            cislo = sc.nextInt();
//            soucet += cislo;
//        }
//        while (cislo != 0);
//        System.out.println("Součet je: " + soucet);


        // Napište program, který od uživatele načte heslo.
        // Bude mu povoleno maximálně 3 pokusy na jeho správné zadání.
        // Pokud uživatel zadá heslo špatně 3krát, program vypíše hlášení "Přístup zamítnut".
        // Pokud zadá správné heslo, program vypíše "Přístup povolen" a ukončí se.

//        Scanner scn = new Scanner(System.in);
//        int SpravneHeslo = 1893;
//        int momentalnipokus = 0;
//        while (momentalnipokus != 3) {
//            System.out.println("Zadej heslo.");
//            int heslo = scn.nextInt();
//            if (SpravneHeslo == heslo) {
//                System.out.println("Správné heslo.");
//                momentalnipokus = 3;
//                return;
//            }
//            System.out.println("Špatné heslo.");
//            momentalnipokus++;
//        }
        // Napište program, který bude od uživatele načítat kladná čísla.
        // Když uživatel zadá záporné číslo, program se ukončí a vypíše, kolik sudých čísel uživatel zadal.

        Scanner sca = new Scanner(System.in);
        int number;
        int sudacisla = 0;
        do {
            System.out.println("Zadej číslo.");
            number = sca.nextInt();
            if (number % 2 == 0){
                sudacisla++;
            }
        } while (number >= 0);
        System.out.println("Počet sudých čísel je: " + sudacisla);



    }
}
