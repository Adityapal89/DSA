class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        int[] freq = new int[101];
        for (int b : bulbs) {
            freq[b]++;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (freq[i] % 2 == 1) {
                result.add(i);
            }
        }
        return result;
        // HashSet<Integer> set = new HashSet<>();
        // for(int i=0; i<bulbs.size(); i++){
        //     if(set.contains(bulbs.get(i))){
        //         set.remove(bulbs.get(i));
        //     } else{
        //         set.add(bulbs.get(i));
        //     }
        // }
        // List<Integer> li = new ArrayList<>(set);
        // Collections.sort(li);
        // return li;
    }
}