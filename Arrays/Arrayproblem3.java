// Write a program to FindTransposeofa Matrix.
// What is Transpose?Transpose of a matrix is the process ofswapping therows to columns. For a 2x3 matrix.
//    Matrix :
//    a11    a12    a13
//    a21    a22    a23
//
//    Transposed Matrix :
//    a11    a21
//    a12    a22
//    a13    a23
public class Arrayproblem3 {
    public static void transpose(int arr[][]){
        int row = 2;
        int col = 3;

        int trans[][]  = new int[col][row];
        for (int i = 0; i<row; i++){
            for (int j = 0; j<col; j++){
                trans[j][i] = arr[i][j];
            }
        }
    }
    public static void print(int arr[][]){
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+", ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][]nums = { {1,4,9},{11,4,3} };
        System.out.println("Original Array : ");
        print(nums);
        transpose(nums);
        System.out.println("After transepose :");
        print(nums);
    }
}
