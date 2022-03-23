package L4_Printf_Thread_Sleep_Print_TwoDimensionalList;

public class Banking {
    public static void main(String[] args) {
        int usd = 100000;
        int interest = 7;
        int years = 5;

        for(int i = 0; i < years; i++){
            for(int month = 0; month < 12; month++){
                usd = usd + (usd * interest / 100) / 12;
            }
        }
        System.out.println(usd);
    }
}
