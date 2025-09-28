class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for(int i=31; i>=0; i--){
            int bit = n & 1;
            result = result + (bit << i);
            n = n >> 1;
        }
        return result;
    }
}