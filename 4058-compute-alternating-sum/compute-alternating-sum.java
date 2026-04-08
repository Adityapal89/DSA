class Solution {
    public int alternatingSum(int[] nums) {
        int s = 0;
        int end = 0;
        for(int i=0; i<nums.length; i++){
            if(i%2 == 0){
                s = s + nums[i];
            }else{
                end = end + nums[i];
            }
        }
        return s - end;
    }
}