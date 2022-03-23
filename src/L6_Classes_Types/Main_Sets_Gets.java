package L6_Classes_Types;

public class Main_Sets_Gets {
    public static void main(String[] args) {
        //formula of object creating
        Animal_Gets_Sets dog = new Animal_Gets_Sets();
        dog.setAge(12);

        Animal_Gets_Sets cat = new Animal_Gets_Sets();

        System.out.println(dog.getAge());
        System.out.println(cat.getAge());
    }
}
