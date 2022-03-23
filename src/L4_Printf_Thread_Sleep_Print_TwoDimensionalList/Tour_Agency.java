package L4_Printf_Thread_Sleep_Print_TwoDimensionalList;

import java.util.Scanner;

public class Tour_Agency {
    public static void main(String[] args) {
        String[][] tours = {{"1", "Italy", "5 Days", "Aircraft", "100000", "5 stars", "BB", "Yes"},
                            {"2", "France", "6 Days", "Aircraft", "140000", "4 stars", "B", "No"},
                            {"3", "Italy", "12 Days", "Aircraft", "140000", "3 stars", "BB", "No"},
                            {"4", "Georgia", "6 Days", "Bus", "200000", "4 stars", "BB", "Yes"},
                            {"5", "Malta", "7 Days", "Aircraft", "140000", "5 stars", "B", "Yes"},
                            {"6", "Malta", "3 Days", "Aircraft", "130000", "3 stars", "BB", "Yes"}};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add country: ");
        String country = scanner.nextLine();

        System.out.println("Your Budget?");
        String usdTour = scanner.nextLine();
        int usd = Integer.parseInt(usdTour);

        System.out.println("You can visit following tours: ");
        for(int i = 0; i < tours.length; i++){
            int costTour = Integer.parseInt(tours[i][4]);
            if(country.equalsIgnoreCase(tours[i][1]) && costTour > usd - 30000 && costTour < usd + 30000){
                System.out.printf("%s. %s: %s, %s, for %s RUB, %s, %s, Transfer -%s \n",
                                  tours[i][0], tours[i][1],tours[i][2], tours[i][3],
                                  tours[i][4], tours[i][6], tours[i][5], tours[i][7]);

            }
        }
    }
}
