class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        int[] freq = new int[max + 1];
        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;
        }
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 0 && isPrime(freq[i])){
                return true;
            }
        }
        return false;
    }
    private boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}