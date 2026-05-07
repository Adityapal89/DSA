class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int val = entry.getKey();
            if(entry.getValue() %k ==0){
                ans += val * entry.getValue();
            }
        }
        return ans;
    }
}