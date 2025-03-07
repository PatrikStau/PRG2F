package Variables;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Variables_cv {
    public static void main(String[] args) {
        /*
         připomínka z minulé hodiny
         Rozdělte datové typy k proměnnám
         String, boolean, char, int, double
                type vek = 0;                         // celá čísla v rozsahu cca -2 miliardy až ~2 miliardy
                type PI = 3.14159d;                   // reálná čísla (s desetinou čárkou)
                type isTrue = true;                   // pravdivostní hodnota true/false (ano/ne)
                type bigA = 'A';                      // jeden znak, píše se do ''
                type name = "Jmeno";                  // textový řetězec (znak/slovo/text), píše se do "";
        */


        /**
         * CV 1
         * Uložte 2 libovolná čísla do 2 proměnných
         * Poté je:
         * Vypište, Přehoďte, Vypište,
         */

        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 2;
        System.out.println(a);
        System.out.println(b);

        int temp = 0;
        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);


        /**
         * CV 2
         * Napište jednoduchou kalkulačku, která bude umět +, -, *, / nad dvěma čísly z množiny R (Reálných čísel).
         * Výsledky vypište na konzoli
         */

        int c = 9;
        int d = 4;
        System.out.println(c+d);
        System.out.println(c-d);
        System.out.println(c*d);
        System.out.println(c/d);


        /**
         * CV 3
         * Uložte do proměnné pravdivostního typu, zda součet 3 libovolných malých písmen je větší než 300.
         * Výsledek vypište na konzoli
         */

        /**
         * CV 4
         * Zeptejte se uživatele na jeho, jméno, příjmení, PSČ a rodné číslo
         * Údaje pak uživateli vypište
         */

        /**
         * CV 5
         * Vygenerujte šachovnici o velikosti NxN, kde N je vstup od uživatele
         * int n;
         *
         * Pro generaci šachovnice odkomentujte následující kód
         for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
         if ((i + j) % 2 == 0) System.out.print("■");
         else System.out.print("□");
         }
         System.out.println();
         }
         */

        /*
        Pokud byste chtěli vypisovat barevně, lze využít tyto řetězce
        - Použití - System.out.println(RED + "Your message" + Reset);
        final String RESET = "\u001B[0m";
        final String BLACK = "\u001B[30m";
        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String YELLOW = "\u001B[33m";
        final String BLUE = "\u001B[34m";
        final String PURPLE = "\u001B[35m";
        final String CYAN = "\u001B[36m";
        final String WHITE = "\u001B[37m";
        */


        /**
         * načíst 2 strany obdélníku
         * obvod
         */

        Scanner sca = new Scanner(System.in);

        System.out.println("Zadej stranu a:");
        int m = sca.nextInt();

        System.out.println("Zadej stranu b:");
        int n = sca.nextInt();

        System.out.println(2*(m+n));

        /**
         * načíst °C a převést na °F
         */

        //F = °C × (9/5) + 32

        System.out.println("Zadej teplotu ve °C");
        double celsius = sca.nextDouble();
        double F = celsius * (9d/5d) + 32;
        System.out.println("Teplota ve F: " + F);

        /** načíst horní a spodní mez
         * vypsat náhodné číslo v tom rozmezí
         */
        int max = 50;
        int min = 12;

        Scanner scn = new Scanner(System.in);
        System.out.println("Zadej horní mez");
        int k = scn.nextInt();
        System.out.println("Zadej spodní mez");
        int l = scn.nextInt();
        Random rng = new Random();
        int vys = rng.nextInt();
        System.out.println(vys);




    }}

