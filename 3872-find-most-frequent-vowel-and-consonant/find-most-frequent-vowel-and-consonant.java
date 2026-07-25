class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> mp1 = new HashMap<>();
        HashMap<Character,Integer> mp2 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='i' || ch == 'o' || ch == 'u' || ch == 'e'){
                mp1.put(ch,mp1.getOrDefault(ch,0)+1);
            }else{
                mp2.put(ch,mp2.getOrDefault(ch,0)+1);
            }
        }
        int vowelCount = 0;
        int conCount = 0;
        for(int val : mp1.values()){
            if(val > vowelCount){
                vowelCount = val;
            }
        }
        for(int val : mp2.values()){
            if(val > conCount){
                conCount = val;
            }
        }

        return vowelCount+conCount;

    }
}