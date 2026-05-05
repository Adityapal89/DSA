class Solution {
    public int minMoves(int[] nums) {
        int maxVal = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > maxVal){
                maxVal = nums[i];
            }
        }
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            int sub = maxVal - nums[i];
            ans += sub;
        }
        return ans;
    }
}