class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // int a = nums[n-1];
        // int b = nums[n-2];
        // int c = nums[0];
        // return (a+b-c);
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max1){
                max2 = max1;
                max1 = nums[i];
            } else if(nums[i] > max2){
                max2 = nums[i];
            }
            if(nums[i] < min1){
                min1 = nums[i];
            }
        }
        return (max1+max2 - min1);
    }
}