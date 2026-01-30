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
    public static int height(TreeNode root){
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public void nthLevelRL(TreeNode root, int n,List<Integer> ans){
        if (root == null) return;
        if (n == 1){
            ans.add(root.val);
            return;
        }
        nthLevelRL(root.right, n-1,ans);
        nthLevelRL(root.left, n-1,ans);
    }

    public void nthLevelLR(TreeNode root, int n,List<Integer> ans){
        if (root == null) return;
        if (n == 1){
            ans.add(root.val);
            return;
        }
        nthLevelLR(root.left, n-1,ans);
        nthLevelLR(root.right, n-1,ans);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> st = new ArrayList<>();
        if(root == null) return st;
        int lev = height(root) + 1;
        for (int i = 1; i <= lev; i++) {
            List<Integer> ans = new ArrayList<>();
            if (i%2 != 0){
                nthLevelLR(root,i,ans);
            } else {
                nthLevelRL(root,i,ans);
            }
            st.add(ans);
            
        }
        return st;
    }
}