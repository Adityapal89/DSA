class Solution {
    public int lengthOfLIS(int[] nums) {
        // int[][] dp = new int[nums.length][nums.length];
        // return recMem(-1,0,nums,dp);
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            int left = 0, right = list.size() - 1;
            while(left <= right) {
                int mid = (left + right) / 2;
                if(list.get(mid) == nums[i]) {
                    left = mid;
                    break;
                }
                else if(list.get(mid) < nums[i]) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
            if(left == list.size()) {
                list.add(nums[i]);
            } else {
                list.set(left, nums[i]);
            }
        }
        return list.size();
    }

    // private int recMem(int prev, int curr,int[] nums, int[][] dp){
    //     if(curr == nums.length) return 0;
    //     if(prev != -1 && dp[prev][curr] !=0){
    //         return dp[prev][curr];
    //     }
    //     int inlen = 0;
    //     if(prev == -1 || nums[prev] < nums[curr]){
    //         inlen = 1 + recMem(curr,curr+1,nums,dp);
    //     }
    //     int exlen = recMem(prev,curr+1, nums,dp);
    //     if(prev != -1){
    //         dp[prev][curr] = Math.max(inlen,exlen);
    //     }
    //     return Math.max(inlen,exlen);
    // }
}