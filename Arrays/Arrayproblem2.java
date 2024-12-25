//  Question 2:
//         Print out the sum of the numbers in the second row of the “nums” array.
public class Arrayproblem2 {
    public static int sumofsecrow(int arr[][]){
        int row = 1;
        int col = 0;
        int sum  = 0;
        while ( col != arr.length){
            sum = sum + arr[row][col];
            col++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int [][]nums = { {1,4,9},{11,4,3},{2,2,3} };
        System.out.println(sumofsecrow(nums));
    }
}
