class Solution {
    public int mini(int j, int[] nums){
        int minVal = Integer.MAX_VALUE;
        for(int i=j; i<nums.length; i++){
            minVal = Math.min(minVal,nums[i]);
        }
        return minVal;
    }
    public int firstStableIndex(int[] nums, int k) {
        int maxVal = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            maxVal = Math.max(maxVal,nums[i]);
            int minVal = mini(i,nums);
            int diff = maxVal - minVal;
            if(diff <= k) return i;
        }
        return -1;
    }
}