class Solution {
    public String largestEven(String s) {
        int last_idx = -1;
        for(int i=s.length() - 1; i>=0; i--){
            if(s.charAt(i) == '2'){
                last_idx = i;
                break;
            }
        }
        if(last_idx == -1){
            return "";
        }
        return s.substring(0,last_idx+1);
    }
}