import java.util.Scanner;

public class string_cv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Načtěte jméno.");
        String jmeno = sc.next();
        int delkajmena = jmeno.length();
        System.out.println(delkajmena);
        System.out.println(jmeno.toUpperCase());
    }
}
