class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq = new int[10];
        while(n > 0){
            int d = n % 10;
            freq[d]++;
            n /= 10;
        }
        int minFreq = Integer.MAX_VALUE;
        int result = 0;
        for(int i = 0; i < 10; i++){
            if(freq[i] > 0 && freq[i] < minFreq){
                minFreq = freq[i];
                result = i;
            }
        }
        return result;
    }
}