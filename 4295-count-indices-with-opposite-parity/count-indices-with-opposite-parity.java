class Solution {
    public int[] countOppositeParity(int[] nums) {
        int[] arr = new int[nums.length];
        int idx = 0;
        
        for(int i=0; i<nums.length; i++){
            int count = 0;
            if(nums[i]%2 == 1){
                for(int j=i+1; j<nums.length; j++){
                    if(nums[j]%2 == 0){
                        count++;
                    }
                }
                arr[idx] = count;
                idx++;
            } else{
                for(int j=i+1; j<nums.length; j++){
                    if(nums[j]%2 == 1){
                        count++;
                    }
                }
                arr[idx] = count;
                idx++;
            }
        }
        return arr;
    }
}