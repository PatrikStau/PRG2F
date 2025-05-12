package OOP.Geometrie;

public class Main {
    public static void main(String[] args) {
        Ctverec josef = new Ctverec(-5.2);
        Ctverec radim = new Ctverec(4.7);
        Ctverec franta = new Ctverec(6.3);
        System.out.println("Délka strany čtverce Josef je: " + josef.delkaStrany + " cm");
        System.out.println("Délka strany čtverce Radim je: " + radim.delkaStrany + " cm");
        System.out.println("Délka strany čtverce Franta je: " + franta.delkaStrany + " cm");
    }
}
