//Given an integer array nums, move all 0's to the end of
// it while maintaining the relative order of the non-zero elements.
public class arrproblem14 {
    public static void movezeroes(int arr[]){
        int left = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
    }

    public static void printarr(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,1,0,3,12};
        System.out.println("Original Array :");
        printarr(arr);
        movezeroes(arr);
        System.out.println("After moving zeroes : ");
        printarr(arr);
    }
}
