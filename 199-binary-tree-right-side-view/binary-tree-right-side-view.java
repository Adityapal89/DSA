class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        order(root, arr, 0);
        return arr;
    }

    public void order(TreeNode root, List<Integer> arr, int level){
        if(root == null) return;
        if(level == arr.size()) arr.add(root.val);
        order(root.right, arr, level + 1);
        order(root.left, arr, level + 1);
    }
}