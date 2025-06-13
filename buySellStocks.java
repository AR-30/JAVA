//Best time to buy and Sell stock
/*You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/

public class Main
{
	public static void main(String[] args) {
	    int[] prices={7, 10, 1, 3, 6, 9, 2};
	    
	    int maxProfit=0; 
	    
	    for(int i=0;i<prices.length-1;i++){
	        for(int j=i+1; j<prices.length; j++){
	            maxProfit=Math.max(maxProfit,prices[j]-prices[i]);
	        }
	    }
	    
		System.out.println(maxProfit);
	}
}
