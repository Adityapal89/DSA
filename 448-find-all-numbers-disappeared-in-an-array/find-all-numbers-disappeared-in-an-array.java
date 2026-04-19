public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                result.add(i);
            }
        }
        return result;
    }
}