class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private void helper(int[] nums, int start, List<Integer> tem, List<List<Integer>> res) {
        res.add(new ArrayList<>(tem));
        for (int i = start; i < nums.length; i++) {
            tem.add(nums[i]);
            helper(nums, i + 1, tem, res);
            tem.remove(tem.size() - 1);
        }
    }
}