class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> st = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<n-1; i++){
            minDiff = Math.min(minDiff,Math.abs(arr[i+1] - arr[i]));
        }

        for(int i=0; i<n-1; i++){
            if(Math.abs(arr[i+1] - arr[i]) == minDiff){
                st.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return st;
    }
}