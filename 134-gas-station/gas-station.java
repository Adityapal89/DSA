class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = 0;
        int costSum = 0;
        for(int i=0; i<gas.length; i++){
            gasSum += gas[i];
            costSum += cost[i];
            
        }
        // for(int i=0; i<cost.length; i++){
        //     costSum += cost[i];
        // }
        int start = 0;
        int currGas = 0;
        if(gasSum < costSum) return -1;
        else{
            for(int i=0; i<gas.length; i++){
                currGas += (gas[i] - cost[i]);
                if(currGas < 0){
                    start = i+1;
                    currGas = 0;
                }
            }
        }
        return start;
    }
}