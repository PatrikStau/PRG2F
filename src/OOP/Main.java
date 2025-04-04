package OOP;

public class Main {
    public static void main(String[] args) {
        Clovek ferdinand = new Clovek(4.07);
        Clovek augustin = new Clovek(8.23);

        System.out.println(ferdinand.velikostPalceUNohy);
        System.out.println(augustin.velikostPalceUNohy);

        Kniha kniha1 = new Kniha();
        kniha1.nazev = "Stařec a moře";
        kniha1.autor = "Ernest Hemingway";
        kniha1.vypisInfo();

        Kruznice l = new Kruznice();
        l.r = 1;
        l.vypoctiObvod();
        l.vypoctiObsah();



    }
}
