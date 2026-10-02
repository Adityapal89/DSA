class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(res.length());
            }else if(ch == ')'){
                int l = st.pop();
                reverse(res, l,res.length()-1);
            }else{
                res.append(ch);
            }
        }
        return res.toString();
    }

    public void reverse(StringBuilder res, int i, int j){
        while(i < j){
            char temp = res.charAt(i);
            res.setCharAt(i,res.charAt(j));
            res.setCharAt(j,temp);
            i++;
            j--;
        }
    }
}