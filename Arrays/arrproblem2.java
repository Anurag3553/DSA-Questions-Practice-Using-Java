public class arrproblem2 {
    public static int Largestvalue(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,2,8,7,3};
        int ans = Largestvalue(arr);
        System.out.println("The largest value is : "+ans);
    }
}
