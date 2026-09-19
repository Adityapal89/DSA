class Solution {
    private int sqrt(long x) {
        long i=1; 
        long j = x;
        if(x == 0) return 0;
        while(i <= j){
            long mid = i + (j - i)/2;
            if(mid == x/mid) return (int)mid;
            else if(mid > x/mid) j = mid - 1;
            else i = mid + 1;
        }
        return (int)j;
    }
    public int arrangeCoins(int n) {
        

        long m = (long)n;
        return (sqrt(8*m+1)-1)/2;
    }
}