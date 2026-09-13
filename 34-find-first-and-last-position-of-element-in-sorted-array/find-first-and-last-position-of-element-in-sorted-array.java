class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] temp = new int[2];
        // Arrays.fill(temp,-1);
        // int idx = 0;    
        // for(int i = 0; i<n; i++){
        //     if(nums[i] == target){
        //         temp[idx] = i;
        //         idx++;
        //         break;
        //     } 
        // }
        // for(int i=n-1; i>=0; i--){
        //     if(nums[i] == target){
        //         temp[idx] = i;
        //         break;
        //     }
        // }
        // return temp;
        int i = 0; int j = nums.length - 1;
        int idx = -1;
        while(i <= j){
            int mid = i + (j-i)/2;
            if(nums[mid] == target){
                idx = mid;
                j = mid - 1;
            } else if(nums[mid] < target){
                i = mid + 1;
            } else{
                j = mid - 1;
            }
        }
        temp[0] = idx;

        int idx1 = -1;
        int lo = 0; int hi = nums.length-1;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid] == target){
                idx1 = mid;
                lo = mid + 1;
            } else if(nums[mid] < target){
                lo = mid + 1;
            } else{
                hi = mid - 1;
            }
        }

        temp[1] = idx1;

        return temp;

        
    }
}