/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void inorder(TreeNode root, ArrayList<Integer> st){
        if(root == null) return;
        inorder(root.left,st);
        st.add(root.val);
        inorder(root.right,st);
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> st = new ArrayList<>();
        inorder(root,st);
        for(int i=1; i< st.size(); i++){
            if(st.get(i) <= st.get(i-1)){
                return false;
            }
        }
        return true;
    }
}