class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] arr = new int[2];
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             arr[0] = i;
        //             arr[1] = j;
        //             break;
        //         }
        //     }
        // }
        // return arr;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int sum = target - nums[i];
            if(mp.containsKey(sum)){
                return new int[]{mp.get(sum), i};
            } 

            mp.put(nums[i] , i);
        }
        return new int[]{};
        
    }
}