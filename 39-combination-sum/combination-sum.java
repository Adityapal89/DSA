class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combi = new ArrayList<>();
        int i = 0;
        combinationRec(arr,i,target,ans,combi);
        return ans;
        
    }
    public void combinationRec(int[] arr, int i, int target, List<List<Integer>> ans,List<Integer> combi){
        int n = arr.length;
        if(i == n || target < 0){
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<>(combi));
            return;
        }
        combi.add(arr[i]);
        //include
        combinationRec(arr,i, target-arr[i],ans,combi);
        combi.remove(combi.size() - 1);//backtracking
        //exclude
        combinationRec(arr,i+1, target,ans,combi);
    }
}