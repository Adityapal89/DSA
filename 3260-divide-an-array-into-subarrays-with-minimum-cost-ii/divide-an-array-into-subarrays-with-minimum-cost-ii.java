class Solution {

    TreeMap<Integer, Integer> small = new TreeMap<>();
    TreeMap<Integer, Integer> large = new TreeMap<>();

    long sumSmall = 0;
    int sizeSmall = 0;
    int sizeLarge = 0;
    int need;

    public long minimumCost(int[] nums, int k, int dist) {
        int n = nums.length;
        need = k - 1;

        long base = nums[0];

        // Initial window [1 .. dist + 1]
        for (int i = 1; i <= dist + 1; i++) {
            add(large, nums[i]);
            sizeLarge++;
        }
        while (sizeSmall < need) {
            int x = large.firstKey();
            remove(large, x);
            sizeLarge--;
            add(small, x);
            sizeSmall++;
            sumSmall += x;
        }

        long ans = sumSmall;
        for (int i = dist + 2; i < n; i++) {
            int out = nums[i - (dist + 1)];
            int in = nums[i];
            if (small.containsKey(out)) {
                remove(small, out);
                sizeSmall--;
                sumSmall -= out;
            } else {
                remove(large, out);
                sizeLarge--;
            }
            add(large, in);
            sizeLarge++;
            if (sizeSmall > 0 && in < small.lastKey()) {
                int x = small.lastKey();
                remove(small, x);
                sizeSmall--;
                sumSmall -= x;
                add(large, x);
                sizeLarge++;
                remove(large, in);
                sizeLarge--;
                add(small, in);
                sizeSmall++;
                sumSmall += in;
            }
            rebalance();
            ans = Math.min(ans, sumSmall);
        }
        return base + ans;
    }
    private void rebalance() {
        while (sizeSmall > need) {
            int x = small.lastKey();
            remove(small, x);
            sizeSmall--;
            sumSmall -= x;

            add(large, x);
            sizeLarge++;
        }
        while (sizeSmall < need) {
            int x = large.firstKey();
            remove(large, x);
            sizeLarge--;

            add(small, x);
            sizeSmall++;
            sumSmall += x;
        }
    }
    private void add(TreeMap<Integer, Integer> map, int x) {
        map.put(x, map.getOrDefault(x, 0) + 1);
    }
    private void remove(TreeMap<Integer, Integer> map, int x) {
        map.put(x, map.get(x) - 1);
        if (map.get(x) == 0) map.remove(x);
    }
}
