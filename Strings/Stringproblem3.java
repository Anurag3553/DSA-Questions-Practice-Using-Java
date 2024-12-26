import java.util.Scanner;

public class Stringproblem3 {
    public static boolean IsPalindrom(String str){
        int n = str.length();
        int i = 0;
        while ( i <= n){
            if (str.charAt(i) != str.charAt(n-1)){
                return false;
            }
            i++;
            n--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String : ");
        String str = sc.nextLine();
        System.out.println(IsPalindrom(str));
    }
}
