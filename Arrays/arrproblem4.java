//Reverse an array
public class arrproblem4 {
    public static void reverseArr(int arr[]){
        for (int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2,6,9,8,10,12,15,11};
        reverseArr(arr);
    }
}
