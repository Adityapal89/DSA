class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        ArrayList<String> ar = new ArrayList<>();
        HashMap<String , Integer> map = new HashMap<>();
        PriorityQueue<String> pq = new PriorityQueue<>(
            (a,b)-> {
                if(map.get(a).equals(map.get(b))){
                    return a.compareTo(b);
                }
                return map.get(b) - map.get(a);
            }
        );

        for(String s : words){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        pq.addAll(map.keySet());
        for(int i=0; i<k; i++){
            ar.add(pq.poll());
        }
        return ar;
    }
}