package L16_Generics;

import java.util.ArrayList;
import java.util.List;

public class Main_Generics {
    public static void main(String[] args) {
        // iter (hot key) - gives for each
        // new Reserve<>("JAVA"); - we can specify argument in () because we didn't create empty constructor.
        // if we don't create empty constructor then it means that () should be filled in by arguments.

        Reserve<String> reserve = new Reserve<>("JAVA");
        Reserve<Integer> reserve2 = new Reserve<> (5);
        reserve.info();
        reserve2.info();


        Pair<String, Integer> pair = new Pair<>("Vlad", 27);
        Pair<Double, String> pair2 = new Pair<>(3.14, "PI");
        pair.infoPair();
        pair2.infoPair();

        List<Integer> integers = List.of(5, 1, 3, 2);
        Integer integer = OtherMethod3.other3(integers); //Alt+Enter - give names to variable (before =) "Integer integer"
        System.out.println(integer);


        List<Integer> integers1 = List.of(5, 1, 3, 2);
        Integer i = OtherMethod3.other3(integers); //Alt+Enter - give names to variable (before =) "Integer integer"
        Number number = OtherMethod3.other(integers1);
        System.out.println(number);

        // List is interface and ArrayList is its realisation
        // ArrayList<>() - in () stay constructor
        //List<String> otherMethods = new ArrayList<>(); //- it is compeliator. () - for constrctor with parameters
        // List otherMethods_ = new ArrayList();       // - in the moment of runtime (moment of fulfilment of command) type "String" is disappered
        //String other = (String) otherMethods.get(0);   // - and when we call function type "String" appear again
    }

}

// <T> - it is Type placeholder generic
// we can write several sections with classes but private class can be only one (above). All other (below) - they are abstract

class Reserve <T>{

    T reserve;

    public Reserve(T value) {
        this.reserve = value;
    }

    public void info(){
        System.out.println(reserve);
    }
}

// if both variables have the same class then we can show only k class Pair <k>{
class Pair <k, v>{

    k key;
    v value;

    public Pair(k key, v value) {
        this.key = key;
        this.value = value;
    }

    public void infoPair(){
        System.out.println("key" + key + "value" + value);
    }
}

// We can type Classes and methods
// Typing (generics) methods are done as below:
// T value means unknown object
// option 1

class OtherMethod{

    public <T> T other (T value) {
        return value;
    }
}

// option 2

class OtherMethod1 <T>{

    public T other1 (T value) {
        return value;
    }
}

// option 3 - specify type (any type extends from Number for example)

class OtherMethod2 <T extends Number>{

    public T other2 (T value) {
        return value;
    }
}

// option 4 - Type of class is unknown, Type of taking object is known: (T value) = value has type List

class OtherMethod3 {

    // we declared that method with type T which extends Numbers and we return the same type and also we want to receive List of this type.
    // we declare that class of this method will be static.
    // Static methods doesn't need creat objects (directly without creating object ---> OtherMethod3.other3())
    // because static relates to method of Class but not method of Object
    // in case of non static method we need to create object of this Class in Main: List otherMethods_ = new ArrayList() ---> OtherMethod3.other3()

    public static <T extends Number> T other3(List<T> value) {
        return value.get(1);
    }

    // instead of type <T> we can use <?> when we don't know classes
    // this method take any type of numbers and make operations with it
    public static Number other(List<? extends Number> value) {
        Integer result = 0;
        for (Number values :
                value) {
            result += (Integer) values;
        }
        return result;
    }
}
