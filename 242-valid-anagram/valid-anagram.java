class Solution {
    public boolean isAnagram(String s, String t){
        // if (s.length() != t.length()){
        //     return false;
        // }
        // HashMap<Character, Integer> mp1 = makeFreqMap(s);
        // HashMap<Character, Integer> mp2 = makeFreqMap(t);
        // return mp1.equals(mp2);

        HashMap<Character, Integer> mp = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0) + 1);
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0) - 1);
        }

        for(int val : mp.values()){
            if(val != 0) return false;
        }

        return true;
        
    }

    static HashMap<Character, Integer> makeFreqMap(String str){
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (!mp.containsKey(ch)){
                mp.put(ch,1);
            } else {
                int currFreq = mp.get(ch);
                mp.put(ch, currFreq+1);
            }
        }
        return mp;
    }
}