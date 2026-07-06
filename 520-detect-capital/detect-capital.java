class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        // if(word.length() == 1) return true;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch)){
                count++;
            }

        }
        if(count == word.length()) return true;
        if(count == 0) return true;
        if(count == 1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        return false;
    }
}