class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums) {
            int left = 0, right = list.size() - 1;
            while(left <= right) {
                int mid = (left + right) / 2;
                if(list.get(mid) == num) {
                    left = mid;
                    break;
                }
                else if(list.get(mid) < num) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
            if(left == list.size()) {
                list.add(num);
            } else {
                list.set(left, num);
            }
        }
        return list.size();
    }
}