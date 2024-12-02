//remove duplicate element from sorted array
public class arrProblem10 {
    public static int removeduplicate(int nums[]){
        int count = 0;
        for (int i = 0; i<nums.length-1; i++){
            if (nums[i] == nums[i+1]){
                continue;
            }
            else {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    public static void print(int nums[]){
        for (int i = 0; i<nums.length; i++){
            System.out.print(nums[i]+", ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Original Array : ");
        print(nums);
        int ans = removeduplicate(nums);
        System.out.println("\nThe number of dubplicate is : "+ans);

    }
}
