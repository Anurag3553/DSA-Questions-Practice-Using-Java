import java.util.ArrayList;

//Find Comntainer with most Water
public class Problem2ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        ArrayList<Integer> max = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int maxi = 0;
        int width = 0;
        for (int i = 0; i<height.size(); i++){
            for (int j = i+1; j<height.size(); j++){
                if (height.get(i) < height.get(j)){
                    width = j - i;
                    maxi = height.get(i) * width;
                    max.add(maxi);
                    System.out.println("["+height.get(i)+", "+height.get(j)+"]");
                }
                else {
                    width = j - i;
                    maxi = height.get(j) * width;
                    max.add(maxi);
                    System.out.println("["+height.get(i)+", "+height.get(j)+"]");
                }
            }
        }
        int maxwater = Integer.MIN_VALUE;
        for (int i = 0; i<max.size(); i++){
            if (max.get(i) > maxwater){
                maxwater = max.get(i);
            }
        }
        System.out.println("The maximum water are soted in conatainer is :"+ maxwater);
    }
}
