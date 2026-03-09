class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int ans =nums.length+1;
        for(int right = 0; right<nums.length; right++){
            sum += nums[right];
            while(sum >= target){
                ans = Math.min(ans,right-left+1);//right-left+1 -> subarray length
                sum -= nums[left++];
            }
        }
        return ans == nums.length+1 ? 0:ans;
    }
}