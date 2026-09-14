class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int maxEle = Integer.MIN_VALUE;
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > maxEle){
                maxEle = arr[i];
                idx = i;
            }
        }
        return idx;
    }
}