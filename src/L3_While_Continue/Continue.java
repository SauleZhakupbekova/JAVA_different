package L3_While_Continue;

public class Continue {
    public static void main(String[] args) {
        // print from 1 to 20 without interval from 5 to 10
        for(int i = 1; i <= 20; i++){
            if(i >= 5 && i <= 10){
                continue; // return to the beginning if condition works
            }
            System.out.println(i);
        }
    }
}
