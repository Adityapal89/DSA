import java.util.*;

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        // int n = nums.length;
        // Set<Integer> set = new HashSet<>();
        // int i = 0, j = 0;
        // int sum = 0;
        // int result = 0;
        // while (j < n) {
        //     if (!set.contains(nums[j])) {
        //         sum += nums[j];
        //         result = Math.max(result, sum);
        //         set.add(nums[j]);
        //         j++;
        //     } else {
        //         while (set.contains(nums[j])) {
        //             sum -= nums[i];
        //             set.remove(nums[i]);
        //             i++;
        //         }
        //     }
        // } 
        // return result;
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int sum = 0;
        int maxSum = 0;
        for (int j = 0; j < nums.length; j++) {
            if (map.containsKey(nums[j])) {
                int prevIndex = map.get(nums[j]);
                while (i <= prevIndex) {
                    sum -= nums[i];
                    i++;
                }
            }
            sum += nums[j];
            map.put(nums[j], j);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}