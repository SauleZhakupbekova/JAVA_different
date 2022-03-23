package L7_Code_Structure;

public class Best_Students extends Student_Equal_HashCode_ToString {//constructor don`t inherent and should be created. Setters and Getters are inherent by default

    public Best_Students() {
    }

    public Best_Students(int age, String name) {
        super(age, name);
    }


    //Update Method

    @Override
    public int perimeterTriangle(int a, int b, int c) {
        if(a + b <= c || b + c <= a || c + a <= b){
            System.out.println("It is not Triangle!");
            return -1;   // -1 stops program because perimeter cannot be -1
        }
        return a + b + c;
    }
}
