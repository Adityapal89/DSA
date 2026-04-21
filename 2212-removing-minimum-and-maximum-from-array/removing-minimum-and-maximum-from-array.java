class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n == 1) return 1;
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < n; i++){
            if (nums[i] < nums[minIdx]) minIdx = i;
            if (nums[i] > nums[maxIdx]) maxIdx = i;
        }
        int a = Math.min(minIdx, maxIdx);
        int b = Math.max(minIdx, maxIdx);
        return Math.min(b + 1, Math.min(n - a, (a + 1) + (n - b)));
    }
}