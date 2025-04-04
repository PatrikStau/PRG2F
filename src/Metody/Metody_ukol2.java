package Metody;

import java.util.Scanner;

public class Metody_ukol2 {

    public static String nactiJmeno(String jmeno) {
        Scanner sc = new Scanner(System.in);
        return jmeno = sc.next();
    }

    public static String nactiPrijmeni(String prijmeni){
        Scanner sc = new Scanner(System.in);
        return prijmeni = sc.next();
    }
    public static String jmenoOdUzivatele(String jmeno, String prijmeni){
        String uzivatelskeJmeno = "";
        if (jmeno.length() < 3){
            uzivatelskeJmeno += jmeno.toLowerCase();
        }
        else {
            uzivatelskeJmeno += jmeno.substring(0,3).toLowerCase();
        }

        if (prijmeni.length() < 3){
            uzivatelskeJmeno += prijmeni.toLowerCase();
        }
        else {
            uzivatelskeJmeno += prijmeni.substring(0,3).toLowerCase();
        }
        return uzivatelskeJmeno;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jmeno = sc.next();
        String prijmeni = sc.next();
        String uzivatelskeJmeno = jmenoOdUzivatele(jmeno, prijmeni);
        System.out.println(jmenoOdUzivatele(jmeno, prijmeni));

        if (uzivatelskeJmeno.length() < 6){
            System.out.println("Uživatelské jméno je moc krátké.");
        }
        else {
            System.out.println("Uživatelské jméno je v pořádku.");
        }


    }
}
