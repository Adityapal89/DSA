class Solution {
    public int findShortestSubArray(int[] nums) {
        int n = nums.length;
        int degree = 0;
        int minLen = n;
        for(int i = 0; i < n; i++) {
            boolean seen = false;
            for(int k = 0; k < i; k++) {
                if(nums[k] == nums[i]) {
                    seen = true;
                    break;
                }
            }
            if(seen) continue;
            int count = 0;
            int first = i;
            int last = i;
            for(int j = 0; j < n; j++) {
                if(nums[j] == nums[i]) {
                    count++;
                    last = j;
                }
            }
            int len = last - first + 1;
            if(count > degree) {
                degree = count;
                minLen = len;
            }
            else if(count == degree) {
                minLen = Math.min(minLen, len);
            }
        }
        return minLen;
    }
}