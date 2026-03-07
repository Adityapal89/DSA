class Solution {
    public int firstMissingPositive(int[] nums) {
        int ans;
        HashSet<Integer> map = new HashSet<>();
        for(int i=0; i<nums.length; i++) map.add(nums[i]);
        ans = 1;
        while(ans <= nums.length){
            if(map.contains(ans)) ans++;
            else return ans;
        }
        return ans;
    }
}