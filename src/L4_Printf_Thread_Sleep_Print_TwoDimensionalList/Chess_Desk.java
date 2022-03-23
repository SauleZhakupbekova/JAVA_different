package L4_Printf_Thread_Sleep_Print_TwoDimensionalList;

import java.util.Arrays;

public class Chess_Desk {
    public static void main(String[] args) {
        //print chess desk
        int[][] chess = new int[8][8];

        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[i].length; j++){
                if((i + j) % 2 == 0){
                    System.out.print("0 ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
