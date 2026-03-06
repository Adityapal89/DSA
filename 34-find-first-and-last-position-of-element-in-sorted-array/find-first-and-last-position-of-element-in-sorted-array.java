class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] temp = new int[2];
        Arrays.fill(temp,-1);
        int idx = 0;    
        for(int i = 0; i<n; i++){
            if(nums[i] == target){
                temp[idx] = i;
                idx++;
                break;
            } 
        }
        for(int i=n-1; i>=0; i--){
            if(nums[i] == target){
                temp[idx] = i;
                break;
            }
        }
        return temp;
    }
}