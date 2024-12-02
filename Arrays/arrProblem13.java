//Given an array nums containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array
public class arrProblem13 {
    public static int missingnumber(int arr[]){
        int sum = 0;
        int n  = arr.length;
        int actsum = n*(n+1)/2;
        for (int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        int ans = actsum - sum;
        return ans;
    }
    public static void main(String[] args) {
        int arr[]  = {3,0,1};
        System.out.println("The missing value is : "+missingnumber(arr));
    }
}
