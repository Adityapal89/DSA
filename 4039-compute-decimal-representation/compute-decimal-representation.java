class Solution {
    public int[] decimalRepresentation(int n) {
        ArrayList<Integer> st = new ArrayList<>();
        int count = 1;
        while(n > 0){
            int mod = n%10;
            if(mod != 0) st.add(mod*count);
            count = count*10;
            n /= 10;
        }
        Collections.reverse(st);
        int[] arr = new int[st.size()];
        for(int i=0; i<st.size(); i++){
            arr[i] = st.get(i);
        }

        return arr;
    }
}