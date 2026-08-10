class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<score.length; i++){
            pq.add(score[i]);
        }

        String[] st = new String[score.length];
        int check = 0;
        while(!pq.isEmpty()){
            int val = pq.remove();
            for(int i=0; i<score.length; i++){
                if(val == score[i]){
                    if(check == 0){
                        st[i] = "Gold Medal";
                    } else if(check == 1){
                        st[i] = "Silver Medal";
                    }else if(check == 2){
                        st[i] = "Bronze Medal";
                    }else{
                        st[i] = "" + (check+1);
                    }
                    check++;
                    break;
                }

                
            }
        }
        return st;

        
    }
}