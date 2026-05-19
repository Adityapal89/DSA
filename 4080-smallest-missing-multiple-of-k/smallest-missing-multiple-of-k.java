class Solution {
    public int missingMultiple(int[] nums, int k) {
        int val = k;
        for(int i=0; i<nums.length; i++){
            boolean found = false;
            for(int j=0; j<nums.length; j++){
                if(val == nums[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                return val;
            }
            val = val + k;
        }
        return val;
    }
}