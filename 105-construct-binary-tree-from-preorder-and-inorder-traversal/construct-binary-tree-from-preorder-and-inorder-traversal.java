class Solution {
    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int[] inorder, int inStart, int inEnd) {
        if (inStart > inEnd) return null;

        // Root from preorder
        TreeNode root = new TreeNode(preorder[preIndex++]);

        // Find root in inorder (linear search)
        int mid = inStart;
        while (inorder[mid] != root.val) {
            mid++;
        }

        // Build left and right subtrees
        root.left = build(preorder, inorder, inStart, mid - 1);
        root.right = build(preorder, inorder, mid + 1, inEnd);

        return root;
    }
}
