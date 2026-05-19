class Solution {
    public int missingMultiple(int[] nums, int k) {
        int val = k;
        for(int i=0; i<nums.length; i++){
            boolean found = false;
            for(int j=0; j<nums.length; j++){
                if(val == nums[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                return val;
            }
            val = val + k;
        }
        return val;


        // HashSet<Integer> set = new HashSet<>();
        // for (int num : nums) {
        //     set.add(num);
        // }
        // for (int multiple = k; ; multiple += k) {
        //     if (!set.contains(multiple)) {
        //         return multiple;
        //     }
        // }
    }
}