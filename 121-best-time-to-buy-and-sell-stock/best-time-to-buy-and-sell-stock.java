class Solution {
    public int maxProfit(int[] prices) {
        int val = prices[0];
        int ans = 0;
        for(int i=1; i<prices.length; i++){
            if(val > prices[i]){
                val = prices[i];
            }else{
                int pro = prices[i] - val;
                ans = Math.max(pro,ans);
            }
        }
        return ans;
    }
}