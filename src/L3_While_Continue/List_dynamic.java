package L3_While_Continue;

public class List_dynamic {
    public static void main(String[] args) {
        // move list on 1 cells and add to new list
        int[] numbers = {1, 6, 4, 5, 9, 4};
        int[] result = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            if(i == 0){
                result[i] = numbers[numbers.length - 1];
            }else{
                result[i]= numbers [i - 1];
            }
            System.out.println(result[i]);
        }
    }
}
