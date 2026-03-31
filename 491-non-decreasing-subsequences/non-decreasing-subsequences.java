class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        backtrack(nums, 0, new ArrayList<>(), res);
        return new ArrayList<>(res);
    }
    private void backtrack(int[] nums, int index, List<Integer> temp, Set<List<Integer>> res) {
        if (temp.size() >= 2) {
            res.add(new ArrayList<>(temp));
        }
        for (int i = index; i < nums.length; i++) {
            if (temp.size() == 0 || nums[i] >= temp.get(temp.size() - 1)) {
                temp.add(nums[i]);
                backtrack(nums, i + 1, temp, res);
                temp.remove(temp.size() - 1);
            }
        }
    }
}