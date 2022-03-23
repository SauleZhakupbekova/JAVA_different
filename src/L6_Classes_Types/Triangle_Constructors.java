package L6_Classes_Types;

public class Triangle_Constructors {
    // variable:
    private int a;
    private int b;
    private int c;

    //Constructors:
    public Triangle_Constructors(){

    }
    public Triangle_Constructors(int a, int b, int c){ //part after new in main
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Methods:
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int perimeter(){
        return a + b + c;

    }
}
