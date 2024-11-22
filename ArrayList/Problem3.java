import java.util.ArrayList;
import java.util.stream.Stream;

//Find if any pair in a sorted ArrayList has a target sum. List = [1,2,3,4,5,6] , Target = 5
public class Problem3 {
    public static void PairSum(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i<list.size(); i++){
            sum  = 0;
            for (int j = i+1; j<list.size(); j++){
                 sum = list.get(i) + list.get(j);
                 if (sum == 5){
                     System.out.println("The pair sum of ["+list.get(i)+", "+list.get(j)+"] is "+sum);
                     return;
                 }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        PairSum(list);
    }
}
