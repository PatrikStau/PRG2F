package OOP;

public class Kruznice_vypocty {
    double r;

    public double vypoctiObvod(){
        double obvod = 2 * Math.PI * r;
        System.out.println(obvod);
        return obvod;
    }

    public double vypoctiObsah(){
        double obsah = Math.PI * r * r;
        System.out.println(obsah);
        return obsah;
    }
}
