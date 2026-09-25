class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int val : arr){
            set.add(val);
        }
        int count = 0;
        for (int i=1; i<=arr[arr.length-1]+k; i++){
            if(!set.contains(i)){
                count++;
                if(count == k){
                    return i;
                }
            }
        }
        return -1;
    }
}