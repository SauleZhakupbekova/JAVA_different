package L18_InnerClass;

import java.util.ArrayList;
import java.util.List;

public class Students implements Comparable{
    private String name;
    private String lastname;
    private Integer age;
    private Double score;
    private List<String> stringList = new ArrayList<>();


    // create constructor

    public Students(String name, String lastname, Integer age, Double score) {

        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.score = score;
    }

    //create Getter and Setters

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
