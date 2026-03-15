class Solution {
    public void rotate(int[] nums, int k) {
        int[] res = rotateArr(nums,k);
        for(int i = 0; i < nums.length; i++){
            nums[i] = res[i];
        }
    }
    public static int[] rotateArr(int[] nums, int k){
        int n = nums.length;
        int[] temp = new int[n];
        int idx = 0;
        k = k%n;
        for(int i=n-k; i<n; i++){
            temp[idx] = nums[i];
            idx++;
        }
        for(int i=0; i<n-k; i++){
            temp[idx] = nums[i];
            idx++;
        }
        return temp;
    }

}