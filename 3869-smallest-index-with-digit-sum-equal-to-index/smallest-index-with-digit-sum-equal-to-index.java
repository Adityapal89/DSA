class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int dSum = 0;
            while(num > 0){
                dSum += num % 10;
                num /= 10;
            }
            if(dSum == i) return i;
        }
        return -1;
    }
}