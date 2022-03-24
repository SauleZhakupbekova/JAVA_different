package L14_HashMap;

import java.util.HashMap;

public class Main_HashMap {
    public static void main(String[] args) {
        //TreeMap is sorted array by association
        //LinkedMap - all keys in order
        //HashMap <key (unique code), value>

        HashMap<String, Integer> rating = new HashMap<>();
        rating.put("Manchester", 10);
        rating.put("Liverpool", 6);
        rating.put("Royal", 8);

        System.out.println(rating);
    }
}
