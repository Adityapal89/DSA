class Solution {
    public int minimumPairRemoval(int[] nums) {
        int operations = 0;
        while(!isSorted(nums)){
            int minSum = Integer.MAX_VALUE;
            int index = 0;
            for(int i = 0; i < nums.length - 1; i++){
                int sum = nums[i] + nums[i + 1];
                if(sum < minSum){
                    minSum = sum;
                    index = i;
                }
            }
            int[] temp = new int[nums.length - 1];
            int k = 0;
            for(int i = 0; i < nums.length; i++){
                if(i == index){
                    temp[k++] = nums[i] + nums[i + 1];
                    i++;
                }
                else{
                    temp[k++] = nums[i];
                }
            }
            nums = temp;
            operations++;
        }
        return operations;
    }
    public boolean isSorted(int[] nums){
        for(int i = 1; i < nums.length; i++){

            if(nums[i] < nums[i - 1]){
                return false;
            }
        }
        return true;
    }
}