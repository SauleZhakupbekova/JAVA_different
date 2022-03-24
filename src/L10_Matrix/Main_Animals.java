package L10_Matrix;

public class Main_Animals {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        Animal[] animals = new Animal[4]; //we cannot create object for abstract class but we can create array for this class
        animals[0] = dog2;
        animals[1] = dog1;
        animals[2] = cat2;
        animals[3] = cat1;

        for(Animal animal:animals){
            animal.voice();

        }

    }
}
