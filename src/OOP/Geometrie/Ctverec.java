package OOP.Geometrie;

public class Ctverec {
    double delkaStrany;

    public Ctverec(double value){
        if(value < 0.0){
            delkaStrany = 0.0;
            return;
        }
        this.delkaStrany = value;

    }
}
