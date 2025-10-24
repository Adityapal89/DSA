// any aproach hashset
class Solution {
    static int longestPalindrome(String s) {
    int[] freq = new int[128];

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        freq[c]++;
    }
    int length = 0;
    boolean oddFound = false;
    for (int i = 0; i < 128; i++) {
        int count = freq[i];
        length += (count / 2) * 2;
        if (count % 2 == 1) {
            oddFound = true;
        }
    }
    if (oddFound) {
        length++;
    }

    return length;
}

}