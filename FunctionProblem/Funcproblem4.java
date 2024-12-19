//Question 4 :Write a Java method to compute the sum of the digits in an integer.


import java.util.Scanner;

public class Funcproblem4 {
    public static void digitsum(int num){
        int sum = 0;
        while (num != 0){
            int digit = num % 10;
            sum = sum + digit;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your digit number : ");
        int num = sc.nextInt();
        digitsum(num);
    }
}
