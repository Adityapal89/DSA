class Solution {
    public int smallestAbsent(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        int avg = sum/nums.length;
        int ans = Math.max(1, avg + 1);
        while(true){
            boolean found = false;
            for(int i=0; i<nums.length; i++){
                if(nums[i] == ans){
                    found = true;
                    break;
                }
            }
            if(!found){
                return ans;
            }
            ans++;
        }
    }
}