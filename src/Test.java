import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        // 1. úkol
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte svou hmotnost (0-300).");
        int hmotnost = sc.nextInt();
        if (hmotnost < 100) {
            System.out.println("Můžete se zúčastnit závodu.");
        } else {
            System.out.println("Nemůžete se zúčastnit závodu.");
        }

        // 2. úkol
        Random random = new Random();
        int mince1 = random.nextInt(2);
        int mince2 = random.nextInt(2);
        int mince3 = random.nextInt(2);
        System.out.println(mince1);
        System.out.println(mince2);
        System.out.println(mince3);
        if (mince1 == 1 && mince2 == 1) {
            System.out.println("Vyhrál jsi.");
        }
        else if (mince1 == 1 && mince3 == 1) {
            System.out.println("Vyhrál jsi.");
        }
        else if (mince2 == 1 && mince3 == 1) {
            System.out.println("Vyhrál jsi.");
        }
        else {
            System.out.println("Prohrál jsi.");
        }


        // 3. úkol
        System.out.println("Zadejte svou měsíční spotřebu v litrech (0-50 000).");
        int spotreba = sc.nextInt();
        double cenazalitr = 0;
        double celkovacena = 0;
        if (spotreba > 10000) {
            cenazalitr = 1.2;
            celkovacena = spotreba * cenazalitr;
            System.out.println("Zaplatíte " + celkovacena + " Kč");
        } else if (spotreba > 5000) {
            cenazalitr = 1.5;
            celkovacena = spotreba * cenazalitr;
            System.out.println("Zaplatíte " + celkovacena + " Kč");
        } else if (spotreba > 1000) {
            cenazalitr = 1.8;
            celkovacena = spotreba * cenazalitr;
            System.out.println("Zaplatíte " + celkovacena + " Kč");
        } else {
            cenazalitr = 2;
            celkovacena = spotreba * cenazalitr;
            System.out.println("Zaplatíte " + celkovacena + " Kč");
        }


    }
}
