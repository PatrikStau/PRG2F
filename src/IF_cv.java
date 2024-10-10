import java.util.Random;
import java.util.Scanner;

public class IF_cv {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Načtěte číslo");
        int a = sc.nextInt();
        if (a % 5 == 0) {
            System.out.println("Číslo je dělitelné 5.");
        }
        else {
            System.out.println("Číslo není dělitelné 5.");
        }

        Random rng = new Random();
        int kostka1 = rng.nextInt(1, 7);
        int kostka2 = rng.nextInt(1, 7);
        System.out.println(kostka1);
        System.out.println(kostka2);

        if (kostka1 + kostka2 >=10) {
            System.out.println("Vyhrál jsi.");
        }
        else if (kostka1 == kostka2) {
            System.out.println("Vyhrál jsi.");
        }
        else {
            System.out.println("Nevadí, zkus to znovu");
        }

        System.out.println("Načti číslo");
        int b = sc.nextInt();



    }
}
