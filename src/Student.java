import java.util.Arrays;

public class Student {
    private String jmeno;
    private int[] znamky;

    public Student(){
        this("Jan", new int[]{1,2,5});
    }

    public Student(String jmeno){
        this(jmeno, new int[]{2,4,5});
    }

    public Student(String jmeno, int[] znamky){
        this.jmeno = jmeno;
        this.znamky = znamky;
    }
    public void vypisInfo(){
        System.out.println(jmeno + " " + Arrays.toString(znamky));
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student("František");
        Student st3 = new Student("Marek", new int[] {1,2,3});
        st1.vypisInfo();
        st2.vypisInfo();
        st3.vypisInfo();


    }

}
