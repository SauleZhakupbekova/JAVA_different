package L7_Code_Structure;

public class Main_Polymorphism_ObjectMethods {
    public static void main(String[] args) {
        Best_Students students1 = new Best_Students(23, "Dave");
        Best_Students students2 = new Best_Students(23, "Dave");

        Student_Equal_HashCode_ToString students3 = new Student_Equal_HashCode_ToString(24, "Peter");
        Student_Equal_HashCode_ToString students4 = new Student_Equal_HashCode_ToString(24, "Peter");

        System.out.println(students3.equals(students4));

        Student_Equal_HashCode_ToString[] students = new Student_Equal_HashCode_ToString[4];
        students[0] = students3;
        students[1] = students2;
        students[2] = students1;
        students[3] = students4;

        System.out.println(students3.toString());


        // for each
        for(Student_Equal_HashCode_ToString s:students){ // s -name of current student
            System.out.println(s.perimeterTriangle(2, 2, 20)); //polymorphism - work with data as with one type and to launch as different types

        }

    }
}
