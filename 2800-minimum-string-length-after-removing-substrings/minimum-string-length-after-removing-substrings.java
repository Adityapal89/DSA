class Solution {
    public int minLength(String s) {
        char str[] = s.toCharArray();
        int n = s.length();
        int w = 0;
        for(int r=0; r < n; r++){
            if(w == 0){
                str[w] = str[r];
                w++;
                continue;
            }
            if(str[r] == 'B' && str[w-1] == 'A'){
                w--;
            } else if(str[r] == 'D' && str[w-1] == 'C'){
                w--;
            } else{
                str[w] = str[r];
                w++;
            }
        }
        return w;
    }
}