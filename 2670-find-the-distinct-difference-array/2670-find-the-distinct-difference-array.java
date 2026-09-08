class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] ans = new int[nums.length];
        int[] post = new int[nums.length];
        HashSet<Integer> set = new HashSet<>();
        for(int i=nums.length-1;i>=0;i--){
            set.add(nums[i]);
            post[i]=set.size();
        }
        set.clear();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            int left = set.size();
            int right = (i + 1 < nums.length) ? post[i + 1] : 0;
            ans[i]=left-right;
        }
        return ans;
    }
}