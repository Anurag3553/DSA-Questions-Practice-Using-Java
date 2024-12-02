public class arrProblemTwoSUM {
    public static  int[] twoSum(int[] nums, int target) {
        int sum = 0;
        for (int i = 0; i<nums.length-1;  i++){
            if ((nums[i] + nums[i+1]) == target){
                return new int[]{i, i+1};
            }
        }
        return new int[]{-1};
    }
        public static void main(String[] args) {
            int nums[] = {2,7,11,15};
            System.out.println("two sum is : "+twoSum(nums, 9));
    }
}
