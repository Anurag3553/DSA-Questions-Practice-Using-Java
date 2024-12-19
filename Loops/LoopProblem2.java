//  Print this Inverted Half-Pyramid Pattern
//                     *
//                   * *
//                 * * *
//               * * * *
//             * * * * *
//           * * * * * *
//         * * * * * * *
//       * * * * * * * *

import java.util.Scanner;

public class LoopProblem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter the Column of rows : ");
        int colm = sc.nextInt();

        for(int  i = 1; i<=row;i++){
            for (int j = 1; j<=colm-i; j++){
                System.out.print("  ");
            }
            for (int k = 1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
