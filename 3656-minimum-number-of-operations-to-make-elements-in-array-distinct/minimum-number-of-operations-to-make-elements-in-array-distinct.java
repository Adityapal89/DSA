class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        HashSet<Integer> st = new HashSet<>();
        for (int i = n - 1; i >= 0; i--) {
            if (st.contains(nums[i])) {
                return (int) Math.ceil((i + 1) / 3.0);
            }
            st.add(nums[i]);
        }

        return 0;
    }
}