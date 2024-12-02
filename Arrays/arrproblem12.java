//You are given a large integer represented as an integer array digits,
// where each digits[i] is the ith digit of the integer.
// The digits are ordered from most significant to least significant in left-to-right order.
// The large integer does not contain any leading 0's.
//
//Increment the large integer by one and return the resulting array of digits.
public class arrproblem12 {
    public static int[] addone(int arr[]){
        for (int i = arr.length-1; i>=0; i--){
            if (arr[i] < 9){
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int newnum[]  = new int[arr.length + 1];
        newnum[0] = 1;
        return newnum;
    }
    public static void main(String[] args) {
        int []digits = {9};
        addone(digits);
        for (int i = 0; i<digits.length; i++){
            System.out.print(digits[i]+", ");
        }
    }
}
