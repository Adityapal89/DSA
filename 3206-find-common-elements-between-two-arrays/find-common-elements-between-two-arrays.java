class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        // int num1Count = 0;
        // int num2Count = 0;
        // int[] ans = new int[2];
        // for(int i=0; i<nums1.length; i++){
        //     for(int j=0; j<nums2.length; j++){
        //         if(nums1[i] == nums2[j]){
        //             num1Count++;
        //             break;
        //         }
        //     }
        // }
        // for(int i=0; i<nums2.length; i++){
        //     for(int j=0; j<nums1.length; j++){
        //         if(nums2[i] == nums1[j]){
        //             num2Count++;
        //             break;
        //         }
        //     }
        // }
        // ans[0] = num1Count;
        // ans[1] = num2Count;
        // return ans;

        int ans1 = 0;
        int ans2 = 0;
        int[] ans = new int[2];
        Set<Integer> st1 = new HashSet<Integer>();
        Set<Integer> st2 = new HashSet<Integer>();
        for(int i=0; i<nums1.length; i++){
            st1.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            st2.add(nums2[i]);
        }
        for(int i=0; i<nums1.length; i++){
            if(st2.contains(nums1[i])){
                ans1++;
            }
        }
        for(int i=0; i<nums2.length; i++){
            if(st1.contains(nums2[i])){
                ans2++;
            }
        }
        ans[0] = ans1;
        ans[1] = ans2;
        return ans;
    }
}