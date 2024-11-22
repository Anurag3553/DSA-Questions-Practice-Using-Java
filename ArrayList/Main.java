import java.util.ArrayList;

//Multi-dimensional ArrayList
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        //Add Elements in List1
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        //Add Elements in List2
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);

        mainList.add(list1);
        mainList.add(list2);

        for (int i = 0; i<mainList.size(); i++){
            ArrayList<Integer> currlist = mainList.get(i);
            for (int j = 0; j<currlist.size(); j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
    }
}