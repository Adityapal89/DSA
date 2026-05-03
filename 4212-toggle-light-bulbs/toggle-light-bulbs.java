class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> li = new ArrayList<>();
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
        
    }
}