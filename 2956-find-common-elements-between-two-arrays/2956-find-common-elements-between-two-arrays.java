class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for(int i:nums1) s1.add(i);
        for(int i:nums2) s2.add(i);
        int c1=0,c2=0;
        for(int i:nums1){
            if(s2.contains(i)) c1++;
        }
        for(int i:nums2){
            if(s1.contains(i)) c2++;
        }
        return new int[]{c1,c2};
    }
}