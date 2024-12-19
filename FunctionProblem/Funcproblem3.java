//Question3:Write a Java program to check if a number is a palindrome
//          in Java? (121 is a palindrome, 321 is not)

import java.util.Scanner;

public class Funcproblem3 {
    public static void isPalindrom(int num){
        int count = num;
        int originalnumber = num;
        int reverse = 0;

        while (num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (originalnumber == reverse) {
            System.out.println(count+" It is Palindrome number");
        }else {
            System.out.println(count+" is not a palindrome number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Palindrome number : ");
        int num = sc.nextInt();
        isPalindrom(num);
    }
}
