class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] temp = new int[2];
        //brout force approach
        // int n = arr.length;
        //  for(int i = 0; i < n; i++){
        //     for(int j =  i +1 ; j < n; j++){
        //         if(arr[i] + arr[j] == target){
        //             temp[0] = i+1;
        //             temp[1] = j+1;
        //         }
        //     }
        //  }
        //  return temp;

        int left =0, right = arr.length-1;
        while(left < right){
            if(arr[left] + arr[right] < target){
                left++;
            } else if(arr[left] + arr[right] > target){
                right--;
            } else{
                return new int[]{left+1, right+1};
            }
        }
        return null;
    }
}