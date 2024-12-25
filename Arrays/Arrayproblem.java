//Question 1 :
//        Print the number of 7’s that are in the 2D array.
public class Arrayproblem {
    public static int printNumber(int arr[][]){
        int row = 0;
        int col = 0;
        int count = 0;
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[0].length; j++){
                if (arr[i][j] == 7){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [][] array = { {4,7,8},{8,8,7} };
        System.out.println("The number of 7's is : "+printNumber(array));
    }
}
