class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int[] ans = new int[nums.length - k + 1];
        int idx = 0;
        int st = 0;
        for (int i = k - 1; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            int count = 0;
            int beauty = 0;
            for (int j = -50; j < 0; j++) {
                if (map.containsKey(j)) {
                    count += map.get(j);
                }
                if (count >= x) {
                    beauty = j;
                    break;
                }
            }
            ans[idx++] = beauty;
            map.put(nums[st], map.get(nums[st]) - 1);
            if (map.get(nums[st]) == 0) {
                map.remove(nums[st]);
            }
            st++;
        }
        return ans;
    }
}