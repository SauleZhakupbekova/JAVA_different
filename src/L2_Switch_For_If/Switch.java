package L2_Switch_For_If;

public class Switch {
    public static void main(String[] args) {
        int score = 40; // this score will be added from browser

        switch (score){
            case 5: // cases - possible options
                System.out.println("Excellent!");
                break; // don't continue - yellow words like break, default etc..are the reserved words by JAVA. They are totally 40 units. Just remember them!
            case 4:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("Satisfied");
                break;
            case 2:
                System.out.println("Poor!");
                break;
            default: // in all other cases
                System.out.println("It is not score!");
        }

    }
}
