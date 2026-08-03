class Solution {
    public int removeDuplicates(int[] nums) {
        // int j = 0;
        // for(int i = 1; i < nums.length; i++){
        //     if(nums[i] != nums[j]){
        //         j++;
        //         nums[j] = nums[i];
        //     }
        // }
        // j++;
        // return j;

        int o = 0;
        int res = 1;
        int cm = 1;
        while(cm < nums.length){
            if(nums[cm] == nums[cm-1]){
                cm++;
                continue;
            } else{
                nums[o+1] = nums[cm];
                o++;
                res++;
                cm++;
            }
        }
        return res;

        
    }
}