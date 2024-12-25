// Write a program to search an element from matrix / 2DArray.

public class SearchinMatrix {
    public static boolean Search(int arr[][] ,  int key){
        int n = arr.length;
        int row = 0;
        int col = arr[0].length-1;

        while (row < n && col >= 0){
            if (arr[row][col] == key){
                System.out.println("Found at ("+row+", "+col+")");
                return true;
            }
            else if (key < arr[row][col]){
                col--;
            }
            else {
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},
                {5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int key = 15;
        System.out.println(Search(arr, key));
    }
}
