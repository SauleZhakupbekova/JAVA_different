package L4_Printf_Thread_Sleep_Print_TwoDimensionalList;

public class Print_TwoDimensional_List {
    public static void main(String[] args) {
        int[][] numbers = new int[3][4]; //two-dimensional list denoted as two [][]

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}

