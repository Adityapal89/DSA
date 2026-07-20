class Solution {
    public int firstMatchingIndex(String s) {
        char[] arr = new char[s.length()];
        int idx = 0;
        int ans = -1;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            arr[idx] = ch;
            idx++; 
        }
        int n = s.length();

        for(int i=0; i<arr.length; i++){
            if(arr[i] == arr[n-i-1]){
                return i;
            }
        }

        return ans;
    }
}