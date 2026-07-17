class Solution {
    public int[] frequencySort(int[] nums) {
        int[] freq = new int[201];
        for (int num : nums) {
            freq[num + 100]++;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                int f1 = freq[nums[j] + 100];
                int f2 = freq[nums[j + 1] + 100];
                if (f1 > f2 || (f1 == f2 && nums[j] < nums[j + 1])) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return nums;
    }
}