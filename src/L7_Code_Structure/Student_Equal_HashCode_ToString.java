package L7_Code_Structure;

public class Student_Equal_HashCode_ToString {

    // Parameters:
    private int age;
    private String name;

    public Student_Equal_HashCode_ToString() {
    }

    public Student_Equal_HashCode_ToString(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Methods:
    public int perimeterTriangle(int a, int b, int c){
        return a + b + c;
    }

    @Override
    public boolean equals(Object o) {
        //this - object at which this method was called (student3)
        //o - student4
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student_Equal_HashCode_ToString student = (Student_Equal_HashCode_ToString) o;
        if(this.age != student.age)
            return false;

        // ternary operator

        return name != null ? this.name.equals(student.name) : student.name == null;
        // if name is defined then check is it equal to name of another student. If is not defined then check is name of second student is defined. If defined then compare two names
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() :0);
        return result;
    }

    @Override
    public String toString() {
        return "Student_Equal_HashCode_ToString{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
