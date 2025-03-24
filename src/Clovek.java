public class Clovek {

    String jmeno;
    String prijmeni;
    int penize;
    int dluh;
    void zit(){
        System.out.println("Žiju!");
    };
    void spat(){
        System.out.println("ZZZZZZZZZ");
    };
    void umrit(){
        System.out.println("Jsem mrtev");
    };

    public static void main(String[] args) {
        Clovek Patrik = new Clovek();
        Patrik.jmeno = "Patrik";
        Patrik.prijmeni = "Stauber";
        Patrik.penize = 1_000_000;
        Patrik.dluh = 100;


        Patrik.zit();
        Patrik.spat();
        Patrik.umrit();


    }
}
