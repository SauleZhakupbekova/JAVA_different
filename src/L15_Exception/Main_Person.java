package L15_Exception;

//1 - creating object of Exception class
//2 - calling method printStackTrace()
//3 - calling System.exit()
//Exception - checked, Runtime Exception -not checked
// try catch
//FileNotFoundException is branch from IOException. IOException - everything relating to COPY
//All branch exception should be placed above parent
//stacktrace - it is text in console about errors

public class Main_Person {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(-10);
        } catch (WrongAgeException e) {
            e.printStackTrace();
        }
        System.out.println("Program was not broken!");
    }

}
