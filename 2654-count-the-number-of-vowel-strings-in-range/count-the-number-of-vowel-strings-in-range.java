class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i=left; i<= right; i++){
            String s = words[i];
            char f = s.charAt(0);
            char l = s.charAt(s.length() - 1);
            if((f == 'a' || f == 'i' || f == 'o' || f == 'u' || f == 'e') && (l == 'a' || l == 'i' || l == 'o' || l == 'u' || l == 'e')){
                count++;
            }
        }
        return count;
    }
}