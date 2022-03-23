package L2_Switch_For_If;

public class For_if {
    public static void main(String[] args) {
        // print to console numbers from 100 to 200, deviding by 3 and 5
        for(int i = 100; i <= 200; i = i + 2){
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
