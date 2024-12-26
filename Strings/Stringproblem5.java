// Find the largest String
public class Stringproblem5 {
    public static void main(String[] args) {
        String fruits[] = {"Apple","mango","banana"};
        String largest = fruits[0];
        String str1 = "Tony";
        String str2 = "Tony";
        String str3 = new String("Tony");
        if (str1 == str2){
            System.out.println("str1 and str2 Strings are equlas");
        }
        if (str1 == str3){
            System.out.println("Str1 and str3 are equals");
        }else {
            System.out.println("Str1 and str3 are not equals");
        }
        if (str1.equals(str3)){
            System.out.println("Strings are equlas");
        }
        for (int i = 0; i<fruits.length; i++){
            if (largest.compareToIgnoreCase(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println("The largest String is : "+largest);
    }
}
