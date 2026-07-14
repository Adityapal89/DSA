class Solution {
    public int maxArea(int[] arr) {
        int water = 0;
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            water = Math.max(water, height*width);
            if(arr[left] < arr[right]){
                left++;
            } else{
                right--;
            }
        }
        return water;
    }
}