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
    // public void inorder(TreeNode root, List<Integer> st){
    //     if(root == null) return;
    //     inorder(root.left,st);
    //     st.add(root.val);
    //     inorder(root.right,st);
    // }
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode curr = root;
        List<Integer> st = new ArrayList<>();
        while(curr != null){
            if(curr.left!=null){
                TreeNode pred = curr.left;
                while(pred.right != null && pred.right != curr){
                    pred = pred.right;
                }
                if(pred.right == null){
                    pred.right = curr;
                    curr = curr.left;
                } 
                if(pred.right == curr){
                    pred.right = null;
                    st.add(curr.val);
                    curr = curr.right;
                }
            } else{
                st.add(curr.val);
                curr = curr.right;
            }
        }
        return st;
    }
}