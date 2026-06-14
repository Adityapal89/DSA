class Solution {
    public int maxProduct(int[] nums) {
        // int ans = Integer.MIN_VALUE;
        // for(int i=0; i<nums.length; i++){
        //     int product = 1;
        //     for(int j=i; j<nums.length; j++){
        //         product *= nums[j];
        //         ans = Math.max(ans,product);
        //     }
        // }
        // return ans;

        int maxProd = nums[0];
        int minProd = nums[0];
        int ans = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] < 0){
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(nums[i], maxProd*nums[i]);
            minProd = Math.min(nums[i], minProd*nums[i]);
            ans = Math.max(ans, maxProd);
        }
        return ans;
    }
}