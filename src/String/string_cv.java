package String;

import java.util.Scanner;

public class string_cv {
    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Načtěte jméno.");
//        String jmeno = sc.next();
//        int delkajmena = jmeno.length();
//        System.out.println(delkajmena);
//        System.out.println(jmeno.toUpperCase());

//        String jmeno = "    Pepa Pepa   ";
//        String prijmeni = " Skočdopole";
//        System.out.println(jmeno + prijmeni);
//        System.out.println(jmeno.equals(prijmeni));
//
//        System.out.println(jmeno.length());
//        System.out.println(jmeno.indexOf("Pepa"));
//        System.out.println(jmeno.charAt(5));
//        System.out.println(jmeno.toLowerCase());
//        System.out.println(jmeno.toUpperCase());
//        System.out.println(jmeno.trim());
//        System.out.println(jmeno.strip());
//        System.out.println(jmeno.trim() + prijmeni.replace("pole", "chleba"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte větu.");
        String veta = sc.nextLine();
        // Jak se nazývá hlavní město Zimbabwe?
        int pocetslov = 1;
        System.out.println("První slovo je dlouhé " + veta.indexOf(' ') + " písmena");
        for (int i = 0; i < veta.length(); i++) {
            if (veta.charAt(i) == ' '){
                pocetslov++;
            }
        }
        System.out.println("Věta má " +pocetslov + " slov");

        sc.close();
    }
}
