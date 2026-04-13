class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            char current = num.charAt(i);
            while (result.length() > 0 &&
                   result.charAt(result.length() - 1) > current &&
                   k > 0) {
                result.deleteCharAt(result.length() - 1);
                k--;
            }
            if (result.length() > 0 || current != '0') {
                result.append(current);
            }
        }
        while (k > 0 && result.length() > 0) {
            result.deleteCharAt(result.length() - 1);
            k--;
        }
        return result.length() == 0 ? "0" : result.toString();
    }
}