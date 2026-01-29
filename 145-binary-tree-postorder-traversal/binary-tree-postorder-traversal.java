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
    public void postorder(TreeNode root, List<Integer> st){
        if(root == null) return;
        postorder(root.left,st);
        postorder(root.right,st);
        st.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> st = new ArrayList<>();
        postorder(root,st);
        return st;
    }
}