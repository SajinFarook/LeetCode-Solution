class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        //cp=currentprice
        for(int cp:prices){
            if(cp<minprice){
                minprice=cp;
            } 
            else{
                int profit=cp-minprice;
                if(profit>maxprofit){
                    maxprofit=profit;
                }
            }
        }
        return maxprofit;
    }
}