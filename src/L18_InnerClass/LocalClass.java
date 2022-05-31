package L18_InnerClass;

public class LocalClass {
    //we cannot see local class outside.
    // can be extended
    //can be final
    //can implement
    // Local class cannot be static

   void operations(int delimoe, int delitel){

        class Devisions{

            void getChastnoe(){
                System.out.println(delimoe/delitel);

            }
            void getOstatok(){
                System.out.println(delimoe%delitel);
            }
        }

        Devisions devisions = new Devisions();
        devisions.getChastnoe();
        devisions.getOstatok();
    }
}

class Local{
    public static void main(String[] args) {
        LocalClass localClass = new LocalClass();

    }
}