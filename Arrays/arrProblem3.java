public class arrProblem3 {
    public static int BinarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length;
        for (int i = 0; i<arr.length; i++){
            int mid = (start+end)/2;
            if (key > arr[mid]){
                start = mid;
            }else if(key < arr[mid]){
                end  = mid;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,6,9,8,10,12,15,11};
        int key = 9;
        int ans = BinarySearch(arr,key);
        if (ans == -1){
            System.out.println("Key value is not found ");
        }
        else {
            System.out.println("The key value is found at the index of : "+ans);
        }
    }
}
