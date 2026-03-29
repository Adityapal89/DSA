class Solution {
    public int maximumLength(int[] nums) {
        int n = nums.length;
        int countEven = 0;
        int countOdd = 0;
        for(int num : nums){
            if(num%2 == 0) countEven++;
            else countOdd++;
        }
        int parity = nums[0]%2;
        int alter = 1;
        for(int i=1; i<n; i++){
            int currParity = nums[i]%2;
            if(currParity != parity){
                alter++;
                parity = currParity;
            }
        }
        return Math.max(countEven,Math.max(countOdd,alter));
    }
}