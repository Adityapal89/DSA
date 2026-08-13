class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b)->{
                int da = Math.abs(a-x);
                int db = Math.abs(b-x);
                if(da == db){
                    return b-a;
                }

                return db-da;
            }
        );

        for(int ele : arr){
            pq.add(ele);
            if(pq.size()>k) pq.poll();
        }

        ArrayList<Integer> ar = new ArrayList<>();
        while(!pq.isEmpty()){
            ar.add(pq.poll());
        }

        Collections.sort(ar);
        return ar;
    }
}