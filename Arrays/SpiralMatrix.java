// Write a program to print the matrix in Spiral form.
public class SpiralMatrix {
    public static void spiralmatrix(int arr[][]){
        int n = arr.length;
        int sr = 0;
        int Endrow = n-1;
        int sc = 0;
        int Endcol = n-1;
        while (sr <= Endrow && sc <= Endcol){
//            Top
            for (int i = sc; i <= Endcol; i++){
                System.out.print(arr[sr][i]+", ");
            }
            // Right
            for (int i = sr+1; i <= Endrow; i++){
                System.out.print(arr[i][Endcol]+", ");
            }
            // Bottom
            for (int i = Endcol-1; i >= sc; i--){
                if (sr == Endrow){
                    break;
                }
                System.out.print(arr[Endrow][i]+", ");
            }
            //Left
            for (int i = Endrow-1; i>=sr+1; i--){
                if (sc == Endcol){
                    break;
                }
                System.out.print(arr[i][sc]+", ");
            }
            sr++;
            sc++;
            Endrow--;
            Endcol--;
        }
        System.out.println();
    }
    public static void printarr(int arr[][]){
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j< arr.length; j++){
                System.out.print(arr[i][j]+", ");
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                {5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("original Matrix :");
        printarr(matrix);
        System.out.println("\nSpiral Matrix : ");
        spiralmatrix(matrix);
    }
}
