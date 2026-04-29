class Solution {
    public int minimumIndex(int[] cap, int itemSize) {
        int ans = Integer.MAX_VALUE;
        int idx = -1;

        for(int i = 0; i < cap.length; i++){
            int diff = cap[i] - itemSize;

            if(diff >= 0 && diff < ans){
                ans = diff;
                idx = i;
            }
        }

        return idx;  // -1 if no valid found
    }
}