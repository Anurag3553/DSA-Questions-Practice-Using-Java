//Best Time to Buy and Sell Stock and find only maximum profit
public class arrproblem11 {
    public static int bestimetobuy(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int sellPrice = 0;
        int maxprofit = Integer.MIN_VALUE;
        for (int i = 0; i<prices.length; i++){
            if (buyprice <= prices[i]){
                sellPrice = prices[i] - buyprice;
                if (maxprofit <= sellPrice){
                    maxprofit = sellPrice;
                }
            }
            else {
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int ans = bestimetobuy(prices);
        System.out.println("The Maximum profit is  : "+ans);
    }
}
