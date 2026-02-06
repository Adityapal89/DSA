class Solution {
    public void order1(TreeNode root1,List<Integer> st){
        TreeNode curr = root1;
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
    }
    public void order2(TreeNode root2,List<Integer> st){
        TreeNode curr = root2;
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
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> st = new ArrayList<>();
        order1(root1,st);
        order2(root2,st);
        Collections.sort(st);
        return st;
    }
}