import javax.swing.plaf.synth.SynthUI;
import java.util.Scanner;

public class Stringproblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first String : ");
        String str1 = sc.nextLine();
        System.out.println("Enter your Second String : ");
        String str2 = sc.nextLine();
        String concstenate = str1 + str2;
        System.out.println("String Concatenate : "+concstenate);
    }
}
