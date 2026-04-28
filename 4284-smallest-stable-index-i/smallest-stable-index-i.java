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
        // int n = nums.length;
        // int[] prefixMax = new int[n];
        // int[] suffixMin = new int[n];
        // prefixMax[0] = nums[0];
        // for (int i = 1; i < n; i++) {
        //     prefixMax[i] = Math.max(prefixMax[i - 1], nums[i]);
        // }
        // suffixMin[n - 1] = nums[n - 1];
        // for (int i = n - 2; i >= 0; i--) {
        //     suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
        // }
        // for (int i = 0; i < n; i++) {
        //     if (prefixMax[i] - suffixMin[i] <= k) {
        //         return i;
        //     }
        // }
        // return -1;
    }
}