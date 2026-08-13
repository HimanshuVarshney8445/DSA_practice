class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:nums) list.add(i);
        int i=1;
        while(true){
            if(!list.contains(i*k)) return i*k;
            i++;
        }
    }
}