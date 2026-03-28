class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            int left = 0, right = list.size() - 1;
            while(left <= right) {
                int mid = (left + right) / 2;
                if(list.get(mid) == nums[i]) {
                    left = mid;
                    break;
                }
                else if(list.get(mid) < nums[i]) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
            if(left == list.size()) {
                list.add(nums[i]);
            } else {
                list.set(left, nums[i]);
            }
        }
        return list.size();
    }
}