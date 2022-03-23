package L3_While_Continue;

public class List_newList {
    public static void main(String[] args) {
        // create List (length 6 cells) and fill it in with only even numbers starting from 10
        int[] numbers = new int[6]; //creating new list. length in list type should be always added to []. In our case it is 6
        int value = 10;
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = value;
            value += 2;
            System.out.println(numbers[i]);

        }

    }
}
