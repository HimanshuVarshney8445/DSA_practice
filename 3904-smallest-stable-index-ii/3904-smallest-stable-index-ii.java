class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i] = Math.max(pre[i - 1], nums[i]);
        }
        post[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            post[i] = Math.min(post[i + 1], nums[i]);
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int temp = pre[i]-post[i];
            if(temp<=k){
                return i;
            }
        }
        return -1;
    }
}