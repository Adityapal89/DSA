class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> st = new HashSet<>();
        while(!st.contains(n)){
            st.add(n);
            int num = 0;
            while(n > 0){
                int digit = n%10;
                num += digit*digit;
                n /= 10;
            }

            if(num == 1) return true;
            else n = num;
        }

        return false;
        
    }
}