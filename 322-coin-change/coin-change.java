class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] temp = new int[amount + 1];
        return helper(coins, amount, temp);
    }

    private int helper(int[] coins, int amount, int[] temp) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        if (temp[amount] != 0) return temp[amount];
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = helper(coins, amount - coin, temp);
            if (res >= 0 && res < min) {
                min = res + 1;
            }
        }
        temp[amount] = (min == Integer.MAX_VALUE) ? -1 : min;
        return temp[amount];
    }
}