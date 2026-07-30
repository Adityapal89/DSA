import java.util.*;

class Solution {
    public String majorityFrequencyGroup(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        HashMap<Integer, StringBuilder> groups = new HashMap<>();
        for (char ch : freq.keySet()) {
            int f = freq.get(ch);
            if (!groups.containsKey(f)) {
                groups.put(f, new StringBuilder());
            }
            groups.get(f).append(ch);
        }
        int maxGroupSize = 0;
        int bestFrequency = 0;
        for (int f : groups.keySet()) {
            int groupSize = groups.get(f).length();
            if (groupSize > maxGroupSize || 
               (groupSize == maxGroupSize && f > bestFrequency)) {
                maxGroupSize = groupSize;
                bestFrequency = f;
            }
        }
        return groups.get(bestFrequency).toString();
    }
}