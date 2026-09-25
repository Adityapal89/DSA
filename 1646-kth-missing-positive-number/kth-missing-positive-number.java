class Solution {
    public int findKthPositive(int[] arr, int k) {
        // HashSet<Integer> set = new HashSet<>();
        // for (int val : arr){
        //     set.add(val);
        // }
        // int count = 0;
        // for (int i=1; i<=arr[arr.length-1]+k; i++){
        //     if(!set.contains(i)){
        //         count++;
        //         if(count == k){
        //             return i;
        //         }
        //     }
        // }
        // return -1;
        
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            int correct = mid+1;
            int missing = arr[mid] - correct;
            if(missing >= k) j = mid-1;
            else i = mid+1;
            
        }
        return j+1+k;
    }
}