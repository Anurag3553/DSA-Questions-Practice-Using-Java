// Print this numeral Pattern
// let say num -> 5
//      1 2 3 4 5
//      1 2 3 4
//      1 2 3
//      1 2
//      1

import java.util.Scanner;

public class LoopProblem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= num+1-i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
