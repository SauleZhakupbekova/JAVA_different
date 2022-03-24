package L6_Classes_Types;

public class Main_Animal_GetSet {
    public static void main(String[] args) {
        //formula of object creating
        Animal_GetSet dog = new Animal_GetSet();
        dog.setAge(12);

        Animal_GetSet cat = new Animal_GetSet();

        System.out.println(dog.getAge());
        System.out.println(cat.getAge());
    }
}
