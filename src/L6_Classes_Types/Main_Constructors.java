package L6_Classes_Types;

public class Main_Constructors {
    public static void main(String[] args) {
        Triangle_Constructors triangle = new Triangle_Constructors(12, 15, 17); //it is constructor
        //sets we need if we want to change incoming parameters
        Triangle_Constructors triangle1 = new Triangle_Constructors();

        int perimeter = triangle.perimeter();
        System.out.println(perimeter);

        Right_Triangle triangle2 = new Right_Triangle();

        Circle circle1 = new Circle();
        Circle circle2 = new Circle();

        Object[] objects = new Object[5];
        Triangle_Constructors a = (Triangle_Constructors) objects[0];





    }
}
