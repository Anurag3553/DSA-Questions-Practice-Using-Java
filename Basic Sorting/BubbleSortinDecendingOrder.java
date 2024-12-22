// QUESTION : -> 6
//        Write a program to sort an array in Bubble sort in decreasing order

public class BubbleSortinDecendingOrder {
    public static int[] Sorting(int arr[]){
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr.length-1-i; j++){
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
        int arr[]  = {5,4,1,3,2};
        System.out.println("Original Array : ");
        printarr(arr);
        Sorting(arr);
        System.out.println("After Bubble Sort in Descending Order : ");
        printarr(arr);
    }
}
