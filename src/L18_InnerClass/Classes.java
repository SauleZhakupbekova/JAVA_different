package L18_InnerClass;

public class Classes {
//    static class a {}
//    class b {}
//    void method() {class C {}}
//    Anonymous class

    public static void main(String[] args) {
        Car_StaticInnerClass.Engine engine = new Car_StaticInnerClass.Engine(2000); // we created inner class engine
        Car_StaticInnerClass car = new Car_StaticInnerClass("Green", "Lada", engine);

        System.out.println(car);

        // for not static class we create constructor where we create new inner Class (Engine).
        // for static class we do it as above

        Car_NotStaticInnerClass car1 = new Car_NotStaticInnerClass("Green", "Lada", 2000);

        System.out.println(car1);

        Car_NotStaticInnerClass.Engine car2 = car1.new Engine(400); // if we want to change Engine parameter we can do at this one

        System.out.println(engine);


    }

}
// STATIC INNER CLASS:

    class Car_StaticInnerClass {
        static String color; //static variable are the variable of Class
        String brand;        // not static variables are the variables of Object.
        // It is necessary to create object at first and then to call variables after psvm Car car = new Car();

        Engine engine;

        //create constructor

        public Car_StaticInnerClass(String color, String brand, Engine engine) { //and placed new Engine class in Constructor
            this.color = color;
            this.brand = brand;
            this.engine = engine;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "color='" + color + '\'' +
                    "brand='" + brand + '\'' +
                    ", engine=" + engine +
                    '}';
        }


        static class Engine { //inner class. Inner Class can be final like String
            // If inner class is Final then others cannot be extended from it.
            // But Final class by itself can extend from others
            // if inner class is not final it can be extended.
            // Inner class can implement any interface
            int hoursPower;
            static double aDouble; // insight of inner class we can use as internal variables as static so not static as well.

            public Engine(int hoursPower) {
                this.hoursPower = hoursPower;
                System.out.println(color); //we can use external variables through inner class only if they static
            }

            @Override
            public String toString() {
                return "Engine{" +
                        "hoursPower=" + hoursPower +
                        '}';
            }
        }
    }

    //NOT STATIC INNER CLASS

    class Car_NotStaticInnerClass { //this class also can be final, extends and implement Interface
        String color;
        String brand;
        Engine engine;

        public Car_NotStaticInnerClass(String color, String brand, int hoursPower) {
            this.color = color;
            this.brand = brand;
            this.engine = this.new Engine(hoursPower); //create not static Engine Class
        }

        @Override
        public String toString() {
            return "Car{" +
                    "color='" + color + '\'' +
                    "brand='" + brand + '\'' +
                    ", engine=" + engine +
                    '}';
        }


        class Engine {
            int hoursPower;
            static double aDouble;

            public Engine(int hoursPower) {
                this.hoursPower = hoursPower;
                System.out.println(color);
            }

            @Override
            public String toString() {
                return "Engine{" +
                        "hoursPower=" + hoursPower +
                        '}';
            }
        }
    }

    // let's do patternbuilder
