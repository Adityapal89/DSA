class Solution {
    public int dominantIndices(int[] nums) {
        int count = 0;
        int sum = 0;
        int n = nums.length;
        int[] suff = new int[n];
        suff[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--){
            suff[i] = nums[i] + suff[i+1];
        }
        for(int i=0; i<n-1; i++){
            int len = n-i-1;
            int avg = (suff[i+1]/len);
            if(nums[i] > avg){
                count++;
            }
        }
        return count;

    }
}