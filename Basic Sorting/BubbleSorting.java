//  QUESTION : -> 1
//          Write a program to sort an array in Bubble sort

public class BubbleSorting {
    public static int[] Sorting(int arr[]){
        for (int turn = 0; turn<arr.length; turn++){
            for (int j  = 0; j<arr.length-1-turn; j++){
                if (arr[j] > arr[j+1]){
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
        int arr[] = {5,4,1,3,2};
        System.out.println("Original Array : ");
        printarr(arr);
        Sorting(arr);
        System.out.println("After Sorting array : ");
        printarr(arr);
    }
}
