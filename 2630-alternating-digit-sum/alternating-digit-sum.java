class Solution {
    public int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        int sum = 0;
        int sign = 1;
        for (int i = 0; i < s.length(); i++) {
            int dig = s.charAt(i) - '0';
            sum += sign * dig;
            sign *= -1;
        }
        return sum;
    }
}