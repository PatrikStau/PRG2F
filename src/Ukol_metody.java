public class Ukol_metody {
    static void validatePassword(String password){
        // heslo musí být dlouhé minimálně 8 znaků
        if (password.length() < 8){
            System.out.println("Heslo nesplňuje jednu z podmínek: \"moc krátké\"");
            return;
        }
        // heslo nesmí obsahovat slovo heslo
        if (password.toLowerCase().contains("heslo")){
            System.out.println("Heslo nesplňuje jednu z podmínek: \"obsahuje zakázané slovo\"");
            return;
        }
        // heslo musí být dlouhé maximálně 25 znaků
        if (password.length() > 25){
            System.out.println("Heslo nesplňuje jednu z podmínek: \"moc dlouhé\"");
            return;
        }
            System.out.println("Heslo je v pořádku.");
    }

    public static void main(String[] args) {
        validatePassword("Arnost1");
        validatePassword("heslo123");
        validatePassword("ArnostmilujeOtrokovice2025");
        validatePassword("Arnostek1");

    }
}
