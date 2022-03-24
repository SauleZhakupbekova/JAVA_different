package L6_Classes_Types;

public class Animal_GetSet {
    // 1 - variables
    private String breed; // breed - порода
    private int age;
    private  String voice;

    public void setAge(int age){// set parameters - from main
        this.age = age; //"this" define current object to which we use command set
    }

    public int getAge(){//input parameters are not needed. we know them - see above sout
        return this.age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}
