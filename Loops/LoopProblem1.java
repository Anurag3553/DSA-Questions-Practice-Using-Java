//Print the Given Patten of Hollow Rectangle
//        * * * * * *
//        *         *
//        *         *
//        *         *
//        * * * * * *

import java.util.Scanner;

public class LoopProblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter the Column of rows : ");
        int colm = sc.nextInt();

        for(int i = 1; i <= row; i++){
            for (int j = 1; j <= colm; j++){
                if (i == 1 || i == row || j == 1 || j == colm){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
