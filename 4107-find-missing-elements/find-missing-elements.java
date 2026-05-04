class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > maxVal){
                maxVal = nums[i];
            }
            if(nums[i] < minVal){
                minVal = nums[i];
            }
        }
        List<Integer> st = new ArrayList<>();
        for(int i=minVal; i<=maxVal; i++){
            boolean found = false;
            for(int j=0; j<nums.length; j++){
                if(i == nums[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                st.add(i);
            }
        }
        return st;
    }
}