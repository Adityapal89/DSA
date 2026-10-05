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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size() > 0){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode temp = q.remove();
                list.add(temp.val);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
            ans.add(list);   
        }
        return ans;
        
    }
}



// public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> result = new ArrayList<>();
//         if (root == null) return result;
//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.offer(root);
//         while (!queue.isEmpty()) {
//             int levelSize = queue.size();
//             List<Integer> level = new ArrayList<>();
//             for (int i = 0; i < levelSize; i++) {
//                 TreeNode current = queue.poll();
//                 level.add(current.val);
//                 if (current.left != null)
//                     queue.offer(current.left);
//                 if (current.right != null)
//                     queue.offer(current.right);
//             }
//             result.add(level);
//         }
//         return result;
//     }