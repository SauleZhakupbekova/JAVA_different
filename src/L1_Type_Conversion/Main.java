package L1_Type_Conversion;

public class Main {
    public static void main(String[] args) {
        byte a = 12;

        int b = 12;
        byte c = (byte)b; // for conversion from lower to higher level
                          // we need to add type in () before variable like (byte)b
        System.out.println(c);

    }
}
