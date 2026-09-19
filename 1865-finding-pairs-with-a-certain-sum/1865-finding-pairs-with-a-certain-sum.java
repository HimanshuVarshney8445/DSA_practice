class FindSumPairs {
    int[] nums1;
    int[] nums2;
    HashMap<Integer,Integer> map;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1=nums1;
        this.nums2=nums2;
        map = new HashMap<>();
        for (int x : nums2) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
    }
    
    public void add(int index, int val) {
        int old = nums2[index];
        map.put(old,map.get(old)-1);
        nums2[index]+=val;
        int newVal = nums2[index];
        map.put(newVal,map.getOrDefault(newVal,0)+1);
    }
    
    public int count(int tot) {
        int count=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]>tot) continue;
            count+=map.getOrDefault(tot-nums1[i],0);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */