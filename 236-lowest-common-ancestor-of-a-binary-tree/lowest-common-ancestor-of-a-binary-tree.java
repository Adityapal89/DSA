
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root.val == p.val || root.val == q.val) return root;
        TreeNode l = lowestCommonAncestor(root.left, p, q);
        TreeNode r = lowestCommonAncestor(root.right, p, q);
        if(l != null && r != null) return root;
        return (l == null) ? r:l;
    }

    // public boolean exists(TreeNode root, int val) {
    //     if (root == null) return false;
    //     if (root.val == val) return true;
    //     return exists(root.left, val) ||exists(root.right, val);
    // }

    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //     if (root == null) return null;
    //     if (root.val == p.val || root.val == q.val) {
    //         return root;
    //     }
    //     boolean leftP = exists(root.left, p.val);
    //     boolean leftQ = exists(root.left, q.val);
    //     if (leftP && leftQ) {
    //         return lowestCommonAncestor(root.left, p, q);
    //     } else if (!leftP && !leftQ) {
    //         return lowestCommonAncestor(root.right, p, q);
    //     } else {
    //         return root;
    //     }
    // }
}
