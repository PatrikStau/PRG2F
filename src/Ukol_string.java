import java.util.Scanner;

public class Ukol_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej jméno.");
        String jmeno = sc.next();
        System.out.println("Zadej příjmení.");
        String prijmeni = sc.next();
        String jmenoPozpatku = "";
        String prijmeniPozpatku = "";

        for (int i = jmeno.length() - 1; i >= 0 ; i--) {
            jmenoPozpatku = jmenoPozpatku + jmeno.charAt(i);
        }
        for (int i = prijmeni.length() - 1; i >= 0; i--) {
            prijmeniPozpatku = prijmeniPozpatku + prijmeni.charAt(i);
        }
        System.out.println(jmenoPozpatku.toUpperCase() + " " + prijmeniPozpatku.toUpperCase());
    }
}
