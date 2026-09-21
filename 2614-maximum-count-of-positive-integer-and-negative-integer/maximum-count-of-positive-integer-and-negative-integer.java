class Solution {
    public int maximumCount(int[] nums) {
        // int negCount = 0;
        // int posCount = 0;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] > 0){
        //         posCount++;
        //     } else if(nums[i] < 0){
        //         negCount++;
        //     }
        // }
        // return Math.max(negCount, posCount);

        int i = 0;
        int j = nums.length-1;
        int pos = 0;
        int neg = 0;
        if(nums[0] > 0 || nums[nums.length-1] < 0){
            return nums.length;
        }
        while(i <= j){
            int mid = i+(j-i)/2;
            if(nums[mid] >= 0){
                j = mid-1;
            } else{
                i = mid+1;
            }
        }
        neg = i;

        i = 0;
        j = nums.length-1;
        while(i <= j){
            int mid = i+(j-i)/2;
            if(nums[mid] <= 0){
                i = mid+1;
            } else{
                j = mid-1;
            }
        }
        pos = nums.length-i;

        return Math.max(pos,neg);

    }
}