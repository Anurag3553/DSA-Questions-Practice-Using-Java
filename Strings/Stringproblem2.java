import java.util.Scanner;

public class Stringproblem2 {
    public static void printString(String str){
        for (int i = 0 ; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first String : ");
        String str = sc.nextLine();
        printString(str);
    }
}
