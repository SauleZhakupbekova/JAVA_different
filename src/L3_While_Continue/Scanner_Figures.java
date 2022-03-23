package L3_While_Continue;

// FnF4 - open description of Scanner type.
// java.util - dimensionless lists
// java.lang - automatic link to all classes
// java.io and java.nio - work with files - copy, replace, remove, move
// java.math - math operatopm
// java.applet - applet - full access to computer
// java.awt - drawing (old libraries)
// java.net - internet
// java.security - security
// java.sql - work with sql database
// java.text - work with texts
// java.time - with time

public class Scanner_Figures {
    public static void main(String[] args) {
        System.out.println("Select figure: ");
        System.out.println("1 - Circle");
        System.out.println("2 - Square");
        System.out.println("3 - Triangle");
        System.out.println("4 - Oval");
        System.out.println("5 - Trapezoid");

        java.util.Scanner scanner = new java.util.Scanner(System.in); //data come from keyboard by users
        // System.out means Console
        // System.in means keyboard
        String figure = scanner.nextLine(); //nextLine - get printed row before Enter
        if (figure.equalsIgnoreCase("Circle") || figure.equals("1")) {
            System.out.println("Round or Area?");
            String nameFigure = scanner.nextLine(); // take what user wrote on keyboard
            System.out.println("Add Radius of Circle: ");
            String radius = scanner.nextLine();
            int r = Integer.parseInt(radius); // identify type and transfer type String into type Int for radius
            if(nameFigure.equalsIgnoreCase("Area")){
                System.out.println("Area: " + (Math.PI * (r * r)));
            }else{
                System.out.println("Round: " + (2 * Math.PI * r));
            }


        } else if (figure.equalsIgnoreCase("Square") || figure.equals("2")) {

        } else if (figure.equalsIgnoreCase("Triangle") || figure.equals("3")) {

        } else if (figure.equalsIgnoreCase("Oval") || figure.equals("4")) {

        } else if (figure.equalsIgnoreCase("Trapezoid") || figure.equals("5")) {

        } else {
        }
    }
}
