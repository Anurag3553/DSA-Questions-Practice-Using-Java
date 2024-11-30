//print the subarray and also find total number of subarray
public class arrproblem6 {
    public static void subarray(int arr[]){
        int ts = 0;
        for (int i = 0; i<arr.length-1; i++){
            int start = i;
            for (int j = i+1; j<arr.length; j++){
                int end = j;
                for (int k = start; k<end; k++){
                    System.out.print(arr[k]+", ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The total subarray is : "+ts);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        subarray(arr);
    }
}
