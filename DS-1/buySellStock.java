// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

public class buySellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    // static int maxProfit(int[] prices){ 
    //     int minPrice = Integer.MAX_VALUE;
    //     int maxProfit = 0;

    //     for(int i = 0; i<prices.length; i++){
    //         if(prices[i] < minPrice) 
    //             minPrice = prices[i];
    //         else if(prices[i] - minPrice > maxProfit) 
    //             maxProfit = prices[i] - minPrice;
    //     }
    //     return maxProfit;
    // }
    static int maxProfit(int[] prices){
        int l = 0, r = 1;
        int maxProfit = 0;
        int profit = 0;

        while(r<prices.length){
            if(prices[l] < prices[r]){
                profit = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, profit);
            }
            else l = r;

            r++;
        }
        return maxProfit;
    }
}
