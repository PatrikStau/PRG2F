import java.util.Random;
import java.util.Scanner;

public class blabla {
    public static void main(String[] args) {
        //darování krve 18-65
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte věk od 0 do 100.");
        int vek = sc.nextInt();
        if (vek >= 18 && vek <= 65) {
            System.out.println("Můžete darovat krev.");
        } else {
            System.out.println("Nemůžete darovat krev.");
        }

        Random random = new Random();
        int karta1 = random.nextInt(1, 13);
        int karta2 = random.nextInt(1, 13);
        System.out.println(karta1);
        System.out.println(karta2);
        int soucet = karta1 + karta2;
        if (soucet == 21 || soucet < 10) {
            System.out.println("Vyhrál jsi.");
        } else {
            System.out.println("Prohrál jsi.");
        }

        System.out.println("Zadej počet lahví od 0 do 100.");
        int pocetlahvi = sc.nextInt();
        int cena1 = 540;
        double celkovacena = 0;
        if (pocetlahvi > 50) {
            System.out.println("Celková cena je 0. Pokus o překupnictví.");
        } else if (pocetlahvi > 10) {
            celkovacena = cena1 * pocetlahvi * 0.8;
            System.out.println("Celková cena se slevou 20% je " + celkovacena + "Kč");
        } else if (pocetlahvi > 5) {
            celkovacena = cena1 * pocetlahvi * 0.9;
            System.out.println("Celková cena se slevou 10% je " + celkovacena + "Kč");
        } else {
            celkovacena = cena1 * pocetlahvi;
            System.out.println("Celková cena je " + celkovacena + "Kč");
        }


        System.out.println("Zadejte váhu od 0 do 300 kg.");
        int vaha = sc.nextInt();
        if (vaha > 50 && vaha < 170) {
            System.out.println("Můžete darovat krev.");
        } else {
            System.out.println("Nemůžete darovat krev.");
        }


        int kostka1 = random.nextInt(1, 7);
        int kostka2 = random.nextInt(1, 7);
        int kostka3 = random.nextInt(1, 7);
        System.out.println(kostka1);
        System.out.println(kostka2);
        System.out.println(kostka3);
        if (kostka1 == kostka2 || kostka1 == kostka3 || kostka2 == kostka3) {
            System.out.println("Vyhrál jsi.");
        } else {
            System.out.println("Prohrál jsi.");
        }


        System.out.println("Zadejte spotřebu elektřiny od 0 do 10 000 kWh.");
        int spotreba = sc.nextInt();
        double cena1kwh = 0;
        if (spotreba >= 600) {
            cena1kwh = 5;
            System.out.println("Celková cena je " + cena1kwh * spotreba + " Kč.");
        } else if (spotreba >= 400) {
            cena1kwh = 6;
            System.out.println("Celková cena je " + cena1kwh * spotreba + " Kč.");
        } else if (spotreba >= 200) {
            cena1kwh = 7;
            System.out.println("Celková cena je " + cena1kwh * spotreba + " Kč.");
        } else {
            cena1kwh = 8;
            System.out.println("Celková cena je " + cena1kwh * spotreba + " Kč.");
        }


    }
}
