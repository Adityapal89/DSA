class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int a = nums[n-1];
        int b = nums[n-2];
        int c = nums[0];
        return (a+b-c);
    }
}