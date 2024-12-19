//Question 1 :Write a Java method to compute the averageof three numbers

import java.util.Scanner;

public class Funcproblme1 {
    public static int avgthree(int num1, int num2, int num3){
        int avg = (num1 + num2 + num3)/3;
        return avg;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter num3 : ");
        int num3 = sc.nextInt();
        int ans = avgthree(num1, num2, num3);
        System.out.println("The Average of three numbers is : "+ans);
    }
}
