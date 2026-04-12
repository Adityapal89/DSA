class Solution {
    public int addDigits(int num) {
        // if(num>=0 && num<=9) return num;
        // int sum = 0;
        // while(num != 0){
        //     int res = num%10; 
        //     sum = sum + res;
        //     num = num/10;
        // }
        // return addDigits(sum);

        if(num == 0) return 0;
        if(num%9 == 0) return 9;
        return num%9;
        
    }
}