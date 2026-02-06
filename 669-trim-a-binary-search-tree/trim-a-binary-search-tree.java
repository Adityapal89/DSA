
class Solution {
    public void preorder(TreeNode root,List<Integer> st){
        if(root == null) return;
        st.add(root.val);
        preorder(root.left,st);
        preorder(root.right,st);
    }
    public TreeNode insertIntoBst(TreeNode root, int val){
        if(root == null) return new TreeNode(val);
        if(root.val > val){
            if(root.left == null) root.left = new TreeNode(val);
            else insertIntoBst(root.left,val);
        } else{
            if(root.right == null) root.right = new TreeNode(val);
            else insertIntoBst(root.right,val);
        }
        return root;
    }
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) return null;

        if (root.val < low) {
            return trimBST(root.right, low, high);
        }

        if (root.val > high) {
            return trimBST(root.left, low, high);
        }

        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);

        return root;
    }
}