package L2_Switch_For_If;

public class Example_Banking {
    public static void main(String[] args) {
        int usd = 100000;
        int years = 5;
        int interest = 7;

        for(int month = 0; month < 12 * years; month++){
            usd = usd + (usd * interest / 100) / 12;
        }
        System.out.println(usd);
    }
}
