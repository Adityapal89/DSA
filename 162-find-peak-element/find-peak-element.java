class Solution {
    public int findPeakElement(int[] nums) {
        // int m = Integer.MIN_VALUE;
        // int ans = 0;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] > m){
        //         m = nums[i];
        //         ans = i;
        //     }
        // }
        // return ans;
        int s = 0;
        int e = nums.length-1;
        while(s < e){
            int mid = s + (e-s)/2;
            if(nums[mid] < nums[mid+1]){
                s = mid + 1;
            } else{
                e = mid;
            }
        }
        return s;
    }
}