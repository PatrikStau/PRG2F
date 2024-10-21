package While;

import java.util.Random;

public class While {
    public static void main(String[] args) {
        int cislo = 0;
        while (cislo <= 1000) {
            System.out.println(cislo);
            cislo += 2;
        }

        Random kostka = new Random();
        int hod;
        do {
            hod = kostka.nextInt(1, 7);
            System.out.println(hod);
        } while (hod != 6);


    }
}
