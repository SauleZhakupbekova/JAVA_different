package L12_LibMaven_Collections;

import java.util.LinkedList;
import java.util.TreeSet;

public class Main_Collections {
    public static void main(String[] args) {
        TreeSet<Integer> a = new TreeSet<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        System.out.println(a);

        LinkedList<Integer> b = new LinkedList<>();
        b.add(2);
        b.add(3);
        b.add(5);
        b.add(7);

        CollectionUtil merge = new CollectionUtil();
        System.out.println("Merge " + merge.union(a, b));

        CollectionUtil inter = new CollectionUtil();
        System.out.println("Intersection " + inter.intersection(a, b));

        CollectionUtil noDuplicates = new CollectionUtil();
        System.out.println("Without Duplicates " + noDuplicates.unionWithoutDuplicate(a, b));

        CollectionUtil noInterDuplicates = new CollectionUtil();
        System.out.println("Intersection Without Duplicates " + noInterDuplicates.intersectionWithoutDuplicate(a, b));

        CollectionUtil differ = new CollectionUtil();
        System.out.println("Difference " + differ.difference(a, b));

    }
}
