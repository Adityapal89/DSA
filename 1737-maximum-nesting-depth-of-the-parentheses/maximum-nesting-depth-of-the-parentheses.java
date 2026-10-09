class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int ans = 0;
        int max1 = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
                max1++;
            }else if(ch == ')'){
                ans = Math.max(ans, max1);
                st.peek();
                max1--;
            }
        }
        return ans;
    }
}