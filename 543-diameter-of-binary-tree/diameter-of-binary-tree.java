class Solution {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        levels(root);
        return diameter;
    }
    private int levels(TreeNode node) {
        if (node == null) return 0;
        int left = levels(node.left);
        int right = levels(node.right);
        diameter = Math.max(diameter, left + right);
        return 1 + Math.max(left, right);
    }
}