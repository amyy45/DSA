package arrays;
public class stock_buy_sell {
    static int maxProfit(int prices[]) {
        int n=prices.length;
        int maxPro=0;
        int minPrice=Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            if(prices[i]<minPrice) {
                minPrice=prices[i];
            }
            else if(prices[i]-minPrice>maxPro) {
                maxPro=prices[i]-minPrice;
            }
        }
        return maxPro;
    }

    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println("The maximum profit is: " + maxProfit(prices));
    }
}
