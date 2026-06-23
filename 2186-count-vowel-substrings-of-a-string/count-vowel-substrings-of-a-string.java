class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        for(int i=0; i<word.length(); i++){
            for(int j=i+1; j<= word.length(); j++){
                String s = word.substring(i,j);
                if(isVowel(s)){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isVowel(String s){
        boolean a = false, i = false, o = false, u = false, e = false;
        for(char ch : s.toCharArray()){
            if(ch == 'a') a = true;
            else if(ch == 'i') i = true;
            else if(ch == 'o') o = true;
            else if(ch == 'u') u = true;
            else if(ch == 'e') e = true;
            else return false;
        }

        return a && i && o && u && e;
    }
}