package L6_Classes_Types;

public class Main_Figures {
    public static void main(String[] args) {
        Triangle_Constructors triangle = new Triangle_Constructors(12, 15, 17); //it is constructor
        //sets we need if we want to change incoming parameters

        int perimeter = triangle.perimeter();
        System.out.println("Triangle " + perimeter);


        Right_Triangle triangle2 = new Right_Triangle();
        int perimeter1 = triangle2.perimeter();
        System.out.println("Triangle2 " + perimeter1);


        Circle circle1 = new Circle(1);
        double perimeter2 = circle1.perimeter();
        System.out.println("Circle1 " + perimeter2);


        Oval oval = new Oval(1, 2);
        double perimeter3 = oval.perimeter();
        System.out.println("Oval " + perimeter3);



        Object[] objects = new Object[5];
        Triangle_Constructors a = (Triangle_Constructors) objects[0];





    }
}
