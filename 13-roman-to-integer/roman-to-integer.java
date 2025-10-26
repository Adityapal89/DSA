//second aproach using map
class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = getValue(s.charAt(i));
            if (i + 1 < s.length() && value < getValue(s.charAt(i + 1))){
                result -= value;
            }else{
                result += value;
            }
        }
        return result;
    }

    public static int getValue(char ch) {
        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;
        return 0;
    }
}