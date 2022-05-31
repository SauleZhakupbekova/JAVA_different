package L18_InnerClass;

//TreeSet - if we everytime go to right +1,+1,+1 then TreeSet divide full way into 2 and way decrease by 2
//Comporator - is that what return +1 or -1 or 0
// Anonymous class doesn't have constructor because Anonymous class doesn't have name of class
// we can use outside variables insight of anonymous class
// in anonymous class we can use only final variables or effective variable variables
// effectively final - is not final but we try don't change t.


import L16_Generics.Developers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Main_Students {

    public static void main(String[] args) {

        //Ctrl+D - automatic duplicate of row
        Students student = new Students("James", "Dickens", 19, 4.5);
        Students student1 = new Students("Handy", "Jonson", 21, 4.0);
        Students student2 = new Students("William", "Parking", 17, 3.5);
        Students student3 = new Students("Cortney", "Love", 23, 3.0);
        Students student4 = new Students("Ann", "Break", 22, 5.0);

        TreeSet<Students> set = new TreeSet<>(new Comparator<Students>() {
            //We created belo Anonymous Class:
            @Override
            public int compare(Students o1, Students o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        set.add(student);
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);

        System.out.println(set);

    }
}