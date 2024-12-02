import java.util.Arrays;

//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative
public class arrproblem15 {
    public static void swapping(int nums[], int start , int end){
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]  = temp;
            start++;
            end--;
        }
    }
    public static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        swapping(nums, 0, n - 1);
        swapping(nums, 0, k - 1);
        swapping(nums, k, n - 1);
        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(rotate(nums, k)));

    }
}
