class Solution {
    public int thirdMax(int[] nums) {
        // long v1 = Long.MIN_VALUE;
        // long v2 = Long.MIN_VALUE;
        // long v3 = Long.MIN_VALUE;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] == v1 || nums[i] == v2 || nums[i] == v3){
        //         continue;
        //     }
        //     if(nums[i] > v1){
        //         v3 = v2;
        //         v2 = v1;
        //         v1 = nums[i];
        //     }
        //     else if(nums[i] > v2){
        //         v3 = v2;
        //         v2 = nums[i];
        //     }
        //     else if(nums[i] > v3){
        //         v3 = nums[i];
        //     }
        // }
        // if(v3 == Long.MIN_VALUE) return (int) v1;
        // else return (int)v3;

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                continue;
            }
            if (pq.size() < 3) {
                pq.add(nums[i]);
                set.add(nums[i]);
            } else {
                if (nums[i] > pq.peek()) {
                    set.remove(pq.poll());
                    pq.add(nums[i]);
                    set.add(nums[i]);
                }
            }
        }
        if (pq.size() != 2) {
            return pq.peek();
        }
        pq.poll(); 
        return pq.peek();
    }
}