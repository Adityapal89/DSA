class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(
        //     (a,b)->{
        //         int da = Math.abs(a-x);
        //         int db = Math.abs(b-x);
        //         if(da == db){
        //             return b-a;
        //         }

        //         return db-da;
        //     }
        // );

        // for(int ele : arr){
        //     pq.add(ele);
        //     if(pq.size()>k) pq.poll();
        // }

        // ArrayList<Integer> ar = new ArrayList<>();
        // while(!pq.isEmpty()){
        //     ar.add(pq.poll());
        // }

        // Collections.sort(ar);
        // return ar;

        List<Integer> list = new ArrayList<>();
        int right = arr.length-1;
        int left = 0;
        while(right-left+1 > k){
            if(Math.abs(arr[left] - x) > Math.abs(arr[right] - x)){
                left++;
            }
            else
                right--;
        }
        for(int i = left; i <= right; i++){
            list.add(arr[i]);
        }
        return list;
    }
}