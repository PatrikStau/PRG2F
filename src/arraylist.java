import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> auta = new ArrayList<>();
        auta.add("Škoda");
        auta.add("Ford");
        auta.add("Kia");
        auta.add("Fiat");

        System.out.println(auta.get(0));
        System.out.println(auta.size());
        boolean jeSmazano = auta.remove("fiat");


        System.out.println(auta.size());
        System.out.println(jeSmazano);
        auta.set(0, "Nissan");
        auta.add(2, "Opel");
        System.out.println(auta);
    }
}
