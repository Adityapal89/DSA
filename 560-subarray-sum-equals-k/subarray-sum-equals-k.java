class Solution {
    public int subarraySum(int[] nums, int k) {
        // int count = 0;
        // for(int i=0; i<nums.length; i++){
        //     int sum = 0;
        //     for(int j=i; j<nums.length; j++){
        //         sum += nums[j];
        //         if(sum == k){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        int res = 0;
        int curr = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1);
        for(int i=0; i<nums.length; i++){
            curr += nums[i];
            res += mp.getOrDefault(curr-k,0);
            mp.put(curr, mp.getOrDefault(curr,0)+1);
        }
        return res;

    }
}