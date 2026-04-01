class Solution {
    public boolean isPowerOfTwo(int n) {
        // if(n <= 0) return false;
        // if(n == 1) return true;
        // if(n%2 != 0) return false;
        // return isPowerOfTwo(n/2);

        // if(n == 0) return false;
        // while( n!= 1){
        //     if(n%2 != 0) return false;
        //     else n= n/2;
        // }
        // return true;

        if(n <= 0) return false;
        int res = (n&(n-1));
        if(res == 0) return true;
        return false;
       
    }
}