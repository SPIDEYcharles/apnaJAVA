public class stockBestPrice {

    public static int profit(int [] stock ){
        int minPrice = stock[0];
        int maxProfit = 0;        
        for (int i = 1; i < stock.length; i++) {
            
            if (minPrice > stock[i]) {
                minPrice = stock[i];
            }
            int made = stock[i] - minPrice;
            maxProfit = Math.max(maxProfit, made);
  
        }

        System.out.println("-------");
        return maxProfit;
    }
    public static void main(String[] args) {
        int stock[] = {7,1,5,3,6,4};

        
        System.out.println(profit(stock));
    }
}
