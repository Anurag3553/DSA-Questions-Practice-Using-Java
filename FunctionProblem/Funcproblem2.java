import java.util.Scanner;

//Question2:Write a method name disEven that accepts  an int argument.
//          The method should return true if the argument is even,or false otherwise.
//          Also write a program to test your method.
public class Funcproblem2 {
    public static boolean checkdiseven(int num){
        if (num%2 == 0){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        boolean che = checkdiseven(num);
        if (che == true){
            System.out.println(num + " is even number");
        }else {
            System.out.println(num+" is not a even number");
        }
    }
}
