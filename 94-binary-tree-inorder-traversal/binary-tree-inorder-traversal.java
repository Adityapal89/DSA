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
    public void inorder(TreeNode root, List<Integer> st){
        if(root == null) return;
        inorder(root.left,st);
        st.add(root.val);
        inorder(root.right,st);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> st = new ArrayList<>();
        inorder(root,st);
        return st;
    }
}