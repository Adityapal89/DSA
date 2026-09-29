class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int num : arr) {
            int prev = num - difference;
            int len = map.getOrDefault(prev, 0) + 1;
            map.put(num, len);
            ans = Math.max(ans, len);
        }
        return ans;

    }
}