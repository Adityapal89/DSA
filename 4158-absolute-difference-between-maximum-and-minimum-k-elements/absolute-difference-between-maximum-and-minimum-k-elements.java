class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int ans = 0;
        while(i<k){
            ans += nums[j] - nums[i];
            i++;
            j--;
        }
        return ans;
    }
}