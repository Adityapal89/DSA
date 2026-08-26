class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftArr = new int[nums.length];
        int[] rightArr = new int[nums.length];
        for(int i=1; i<nums.length; i++){
            leftArr[i] =leftArr[i-1] + nums[i-1];
        }
        for(int i=nums.length-2; i>=0; i--){
            rightArr[i] = rightArr[i+1] + nums[i+1];
        }

        for(int i=0; i<nums.length; i++){
            nums[i] = Math.abs(rightArr[i] - leftArr[i]);
        }
        return nums;
    }
}