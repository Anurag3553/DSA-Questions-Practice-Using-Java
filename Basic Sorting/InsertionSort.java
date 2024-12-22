// QUESTION : -> 3
//        Write a program to sort an array in Insertion sort
public class InsertionSort {
    public static int[] Sorting(int arr[]){
        for (int i = 1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            while (prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        return arr;

    }
    public static void printarr(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        System.out.println("Original Array : ");
        printarr(arr);
        System.out.println("After Insertion Sort : ");
        Sorting(arr);
        printarr(arr);
    }
}
