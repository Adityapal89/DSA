class Solution {
    public int digitFrequencyScore(int n) {
        int[] arr = new int[10];
        int idx = 0;
        int ans = 0;
        while(n > 0){
            int dig = n%10;
            arr[dig]++;
            n /= 10;
        }

        for(int i=0; i<=9; i++){
            if(arr[i] > 0){
                ans += i * arr[i];
            }
        }
        return ans;

    }
}