package OOP;

public class Znamka {
    private int hodnota;
    private String nazevPredmetu;

    public Znamka(int hodnota, String nazevPredmetu) {
        this.hodnota = hodnota;
        this.nazevPredmetu = nazevPredmetu;
    }


    public void setHodnota(int hodnota) {
        if (hodnota >= 1 && hodnota <= 5){
            this.hodnota = hodnota;
        }

    }

    public String getNazevPredmetu() {
        return nazevPredmetu;
    }

}
