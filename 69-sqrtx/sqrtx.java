class Solution {
    public int mySqrt(int x) {
        long i=1; 
        long j = x/2;
        if(x < 2) return x;
        while(i <= j){
            long mid = (i+j)/2;
            if(mid*mid == x) return (int)mid;
            else if(mid*mid > x) j = mid - 1;
            else i = mid + 1;
        }
        return (int)j;

        // int root = 0;
        // if(x < 2) return x;
        // for(int i=0; i<=x/2; i++){
        //     if(i*i > x) break;
        //     root = i;
        // }
        // return root;
    }
}