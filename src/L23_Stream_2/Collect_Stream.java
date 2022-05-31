package L23_Stream_2;

import L18_InnerClass.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Collect_Stream {
    public static void main(String[] args) {


        Students student = new Students("James", "Dickens", 19, 4.5);
        Students student1 = new Students("Handy", "Jonson", 21, 4.5);
        Students student2 = new Students("William", "Parking", 17, 3.5);
        Students student3 = new Students("Cortney", "Love", 23, 3.0);
        Students student4 = new Students("Ann", "Break", 22, 5.0);


        List<String> strings = List.of("Math", "IT");
        student.setStringList(strings); //to each student we add new variable strings

//       List<Students> studentsList = new ArrayList<>(); // full way. below is short way of creating Stream - Stream.of(student, student1, student2, student3, student4)
//        studentsList.add(student);
//        studentsList.stream()

// 8) Methode Collect
        //a)           .collect(Collectors.toList()); // full expression: .collect(ArrayList::new, ArrayList::add, ArrayList::addAll)
        // add elemets to collection but nothing return
        // Alt+Enter - Introduce variable
        // Collect creates collection (ArrayList). Add students to collection. Finalize all elements in one All
        //b)           .collect(Collectors.toList());  creates collection which cannot be changed
        //c)           .collect(Collectors.toSet());   also is not changable collection


        //d) Methode Collect.joining

        final String collect = Stream.of(student, student1, student2, student3, student4)
                .map(String::valueOf)// method map - take one type of variables and return another type : value to string
                .collect(Collectors.joining());
        System.out.println(collect);

        System.out.println("_______________");

        final String collect1 = Stream.of(student, student1, student2, student3, student4)
                .map(s -> s.getName())// join only names
                .collect(Collectors.joining());
        System.out.println(collect1);

        System.out.println("_______________");

        final String collect2 = Stream.of(student, student1, student2, student3, student4)
                .map(Students::getName)// join only names by another way
                .collect(Collectors.joining());

        System.out.println(collect2);

        System.out.println("_______________");

        final String collect3 = Stream.of(student, student1, student2, student3, student4)
                .map(Students::getName)
                .collect(Collectors.joining(", ", "", "."));
        System.out.println(collect3);

        System.out.println("_______________");

// Methode groupingBy
        final Map<Double, List<Students>> collect4 = Stream.of(student, student1, student2, student3, student4)
                .collect(Collectors.groupingBy(Students::getScore));

        System.out.println(collect4);

        System.out.println("_______________");

        final Map<String, List<Students>> collect5 = Stream.of(student, student1, student2, student3, student4)
                .collect(Collectors.groupingBy(Students::getName));

        System.out.println(collect5);

        System.out.println("_______________");

        Stream.of(student, student1, student2, student3, student4)
                .collect(Collectors.groupingBy(Students::getName)).forEach((name, listStudents) -> System.out.println(name + "; " + listStudents.stream().map(Students::getLastname).collect(Collectors.toList())));


        System.out.println("_______________");

        // Methode partitioningBy - boolean as predicate methods (separate by several groups)

        Stream.of(student, student1, student2, student3, student4)
                .collect(Collectors.partitioningBy(s -> s.getScore() < 4.0)).forEach((name, listStudents) -> System.out.println(name + "; " + listStudents.stream().map(Students::getLastname).collect(Collectors.toList())));

        System.out.println("_______________");


        final Map<Boolean, List<Students>> mapAvrScore = Stream.of(student, student1, student2, student3, student4)
                .collect(Collectors.partitioningBy(s -> s.getScore() < 4.0));

        mapAvrScore.get(false).forEach(s -> {
            s.setName("Best" + s.getName());
            System.out.println(s);
        });

        System.out.println("_______________");

        mapAvrScore.get(true).forEach(s -> {
            s.setName("Bad" + s.getName());
            System.out.println(s);
        });

        //Primitive classes

        //IntStream;
        //LongStream;
        //DoubleStream;


        IntStream.range(1, 9).forEach(System.out::print); //doesn't include last figure 9 but if we use rangeClosed - it includes last 9
        System.out.println();
        IntStream.generate(() -> 8) // we in methode generate create 8 and print them
                .limit(10) // receive only 10 8
                .skip(5) // remain only 5
                .forEach(System.out::println);
        System.out.println("______________");
        IntStream.iterate(2, num -> ++num).limit(8).forEach(System.out::print); //num is 2,  after that ++ and replace first 2
        // ++num - we increase 2 and after that replace first 2
        // num++ - we just add additional 2 in right

        System.out.println("______________");
        IntStream.iterate(0, num -> num < 10, num -> ++num).forEach(System.out::print);


        // Methode rangeClosed
        IntStream.rangeClosed(1, 9).forEach(System.out::print); //includes last figure 9


        //Methode FlatMap

        Stream.of(student).map(s -> s.getStringList()).forEach(System.out::print); // if we use map we can take from list students all data

        System.out.println("__________________");

        Stream.of(student).flatMap(s -> s.getStringList().stream()).forEach(System.out::println); // if we use flatmap - we directly take only string from list
    }
}
