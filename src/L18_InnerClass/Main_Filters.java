package L18_InnerClass;

import java.util.ArrayList;
import java.util.List;

public class Main_Filters {

    static void FilterByAge(List<Students> students, int age){
    for (Students student: students){
        if(student.getAge() > age) System.out.println(student);
    }
}

    static void FilterByScore(List<Students> students, double score){
        for (Students student: students){
            if(student.getScore() < score) System.out.println(student);
        }
    }
    public static void main(String[] args) {


        Students student = new Students("James", "Dickens", 19, 4.5);
        Students student1 = new Students("Handy", "Jonson", 21, 4.0);
        Students student2 = new Students("William", "Parking", 17, 3.5);
        Students student3 = new Students("Cortney", "Love", 23, 3.0);
        Students student4 = new Students("Ann", "Break", 22, 5.0);

        List<Students> list = new ArrayList<>();

        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        FilterByAge(list, 20);
        System.out.println("--------------------------");
        FilterByScore(list, 3.4);
    }
}

