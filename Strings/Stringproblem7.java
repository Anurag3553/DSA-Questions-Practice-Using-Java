// count the number of vowels in lowercase
public class Stringproblem7 {
    public static int countLowercase(String str){
        int count = 0;
        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "AnuraG YadaV";
        System.out.println("The number of vowels in lowercase : "+countLowercase(str));
    }
}
