package L18_InnerClass;

public class AnonymousClass {
    public static void main(String[] args) {

        //OPTION 1 of method realisation
        Interface_A aaa = new Object_A();
            aaa.check();
        }

        //OPTION 2 of method realisation -is used if we need this method only one time
        // We can create only methode and make its realisation directly here without creating new class below
        Interface_A aaa = new Interface_A() {
            @Override
            public boolean check() {
                return true;
            }
        };
    }



interface Interface_A{
    boolean check();

}

// OPTION 1:
class Object_A implements Interface_A{

    @Override
    public boolean check() {
        return true;
    }
}