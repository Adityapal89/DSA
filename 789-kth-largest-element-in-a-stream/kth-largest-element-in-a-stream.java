class KthLargest {
    PriorityQueue<Integer> pq;
    int k = 0;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            add(nums[i]);
        }
    }
    
    public int add(int val) {
        if(pq.size() < k || val >pq.peek()){
            pq.offer(val);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */