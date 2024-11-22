import java.util.ArrayList;
//Find if any pair in a sorted ArrayList  using Two Pointer has a target sum. List = [1,2,3,4,5,6] , Target = 5
public class Problem4 {
    public static boolean PairSum(ArrayList<Integer> list){
        //Left pointer;
        int lp = 0;
        int rp = list.size()-1;
        while (lp < rp){
            if (list.get(lp)+list.get(rp) == 5){
                return true;
            }
            lp++;
            rp--;

        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("The Target are match in the list ? "+PairSum(list));
    }
}
