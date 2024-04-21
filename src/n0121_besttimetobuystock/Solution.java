package n0121_besttimetobuystock;

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int l = prices[0];

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < l) l = prices[i];
            else {
                int c = prices[i] - l;
                if(c > max) max = c;
            }
        }

        return max;
    }
}