class Solution {
    public int minOperations(int[] nums) {
        // int ans = 0;
        // int maxVal = Integer.MIN_VALUE;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] > maxVal){
        //         maxVal = nums[i];
        //     }
        // }
        // for(int i=0; i<nums.length; i++){
        //     int diff = maxVal - nums[i];
        //     ans += diff;
        // }
        // return ans;

        int ans = 0;
        int curr = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i] != curr) return 1;
        }
        return 0;
    }
}