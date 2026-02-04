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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> st = new ArrayList<>();
        inorder(root,st);
        return st.get(k-1);
    }
}