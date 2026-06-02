class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] arr = new int[nums.length*2];
        int idx = 0;
        for(int i=0; i<nums.length; i++){
            arr[idx] = nums[i];
            idx++;
        }
        for(int i=nums.length-1; i>=0; i--){
            arr[idx] = nums[i];
            idx++;
        }
        return arr;
    }
}