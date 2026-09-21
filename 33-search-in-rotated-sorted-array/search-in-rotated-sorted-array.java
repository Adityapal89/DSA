class Solution {
    public int search(int[] arr, int key) {
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] == target){
        //         return i;
        //     }
        // }
        // return -1;

        int i=0;
        int j = arr.length-1;
        int ans = -1;
        if(arr.length == 1 && arr[0] == key) return 0;
        
        while(i < j){
            if(arr[i] == key) return i;
            if(arr[j] == key) return j;
            if(key > arr[i]){
                i++;
            } else{
                j--;
            }
        }
        return ans;
    }
}