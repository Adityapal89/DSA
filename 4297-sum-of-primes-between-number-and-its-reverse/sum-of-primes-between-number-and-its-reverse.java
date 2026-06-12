class Solution {
    public int sumOfPrimesInRange(int n) {
        int start = n;
        int rev = 0;
        int temp = n;
        while(temp > 0){
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        int sum = 0;
        // if(start < 10) return 0;
        for(int i = Math.min(start, rev); i <= Math.max(start, rev); i++){
            if(i <= 1) continue;
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                sum += i;
            }
        }

        return sum;
    }
}