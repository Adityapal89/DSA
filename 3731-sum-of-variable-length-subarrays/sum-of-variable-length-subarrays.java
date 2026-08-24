class Solution {
    public int subarraySum(int[] nums) {
        int sum = nums[0];
        for(int i=1; i<nums.length; i++){
            int st = Math.max(0, i-nums[i]);
            for(int j = st; j<=i; j++){
                sum += nums[j];
            }
        }

        return sum;
    }
}