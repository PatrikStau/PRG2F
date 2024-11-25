import java.util.Scanner;

public class string {
    public static void main(String[] args) {

        String jmeno = "Martins Ferreira Pereira De Magalhaes";
        String prijmeni = "Mandová";
        jmeno = jmeno + " " + prijmeni;

        int delkaRetezce = "Ahoj".length();
//        System.out.println("delka retezce Ahoj: " + delkaRetezce);
        delkaRetezce = jmeno.length();
//        System.out.println("delka retezce " + jmeno + ": " + delkaRetezce);

        int indexM = jmeno.indexOf('M');
//        System.out.println("Index \"M\": " + indexM);

        int indexMalehoE = jmeno.indexOf('e');
//        System.out.println("Index \"e\": " + indexMalehoE);

        int indexAcka = "Abba".indexOf('A');
//        System.out.println("Index \"A\": " +indexAcka);

        int indexMalehoBecka = "Abba".indexOf('b');
//        System.out.println("Index \"b\": " + indexMalehoBecka);

//        System.out.println(jmeno.toUpperCase());
//        System.out.println(jmeno.toLowerCase());
//
//        System.out.println("aHoJ".toUpperCase());
//        System.out.println("aHoJ".toLowerCase());


        String password = "      heslo          ";
//        System.out.println(password.trim());
//        System.out.println("void                 ".strip());

        String vdanaMandova = jmeno.replace("Mandová", "Cervenokostelecká");
//        System.out.println(vdanaMandova);

        String oprava = vdanaMandova.replace('C', 'Č');
//        System.out.println(oprava);

        // Java a porovnávání řetězců
        {
            // equals porovnává hodnoty
            boolean case1 = new String("test").equals("test"); // true

            // new String("test") a "test" jsou rozdílné objekty. == porovnává, jestli jsou to stejný objekty
            boolean case2 = new String("test") == "test"; // false

            // stejně jako case2
            boolean case3 = new String("test") == new String("test"); // false

            // jedná se o tzv. "literály" a to jsou vždy stejné objekty
            boolean case4 = "test" == "test"; // true

            // literály "te" a "st" se spojí v jeden a odkazuje se poté na jeden a ten samý objekt
            boolean case5 = "test" == "te" + "st"; // true

            // System.out.printf("1. %s\n2. %s\n3. %s\n4. %s\n5. %s\n", case1, case2, case3, case4, case5);
        }

        // pro jednoduchost používejte u řetězců místo ==, equals()
//        System.out.println("Bob".equals("bob"));
//        System.out.println("Bob".equalsIgnoreCase("bob"));



    }
}

