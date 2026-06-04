class Solution {
    public int countMonobit(int n) {
        int count = 1;
        int num = 1;
        while(n >= num){
            count++;
            num = num * 2;
            num += 1;
        }
        return count;

    }
}