//Best time to buy and sell stock and return th maxprofite
public class arrproblem9 {
    public static int besttbuy(int price[]){
        int buyprice = Integer.MAX_VALUE;
        int sellprice = 0;
        int maxprofit = Integer.MIN_VALUE;
        for (int i = 0; i<price.length; i++){
            if(buyprice < price[i]){
                sellprice = price[i] - buyprice;
                if (maxprofit < sellprice){
                    maxprofit = sellprice;
                }
            }else {
                buyprice = price[i];
            }

        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int price[]  = {7,1,5,3,6,4};
        int ans = besttbuy(price);
        System.out.println("The maximum proffite is : "+ans);
    }
}
