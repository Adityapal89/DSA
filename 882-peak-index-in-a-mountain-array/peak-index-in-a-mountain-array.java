class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // int maxEle = Integer.MIN_VALUE;
        // int idx = 0;
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] > maxEle){
        //         maxEle = arr[i];
        //         idx = i;
        //     }
        // }
        // return idx;

        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            int mid = i + (j-i)/2;
            if(arr[mid] < arr[mid + 1]){
                i = mid + 1;
            } else{
                j = mid;
            }
        }
        return i;
    }
}