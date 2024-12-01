public class arrproblem8 {
    public static void maxsubarrya(int arr[]){
        int n = arr.length;
        int sum  = 0;
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i = 0; i<prefix.length; i++){
            int start = i;
            for (int j = i; j<prefix.length; j++){
                int end = j;
                if (start == 0){
                    currsum = prefix[end];
                }
                else {
                    currsum = prefix[end] - prefix[start-1];
                }
            }
            if (currsum >= maxsum){
                maxsum = currsum;
            }
        }
        System.out.println("The maxsum is : "+maxsum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        maxsubarrya(arr);
    }
}
