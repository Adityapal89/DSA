class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        double avg = sum/k;
        double ans = avg;
        for(int i=k; i<nums.length; i++){
            sum = sum - nums[i-k] + nums[i];
            avg = sum/k;
            if(avg > ans){
                ans = avg;
            }
        }
        return ans;
    }
}