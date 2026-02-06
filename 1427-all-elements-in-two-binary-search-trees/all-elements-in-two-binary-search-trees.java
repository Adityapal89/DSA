class Solution {
    public void order1(TreeNode root1,List<Integer> st){
        if(root1 == null) return;
        order1(root1.left,st);
        st.add(root1.val);
        order1(root1.right,st);
    }
    public void order2(TreeNode root2,List<Integer> st){
        if(root2 == null) return;
        order2(root2.left,st);
        st.add(root2.val);
        order2(root2.right,st);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> st = new ArrayList<>();
        order1(root1,st);
        order2(root2,st);
        Collections.sort(st);
        return st;
    }
}