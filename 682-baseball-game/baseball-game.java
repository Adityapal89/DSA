class Solution {
    public int calPoints(String[] s) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            if(s[i].equals("C")){
                st.pop();
            } else if (s[i].equals("D")) {
                int val = st.peek();
                st.push(val*2);
            } else if (s[i].equals("+")) {
                int se = st.pop();
                int fi = st.pop();
                int sum = se + fi;
                st.push(fi);
                st.push(se);
                st.push(sum);
            }else{
                int val = Integer.parseInt(s[i]);
                st.push(val);
            }
        }
        int ans = 0;
        while (!st.isEmpty()){
            ans += st.pop();
        }
        return ans;
    }
}