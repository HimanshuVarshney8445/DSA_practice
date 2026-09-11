class Solution {
    public boolean check(int[] nums,Boolean[] dp,int idx){
        if(idx>=nums.length-1) return true;
        if(nums[idx]==0) return false;
        if(dp[idx]!=null) return dp[idx];
        for(int i=1;i<=nums[idx];i++){
            if(check(nums,dp,idx+i)) return dp[idx]=true;
        }
        return dp[idx]=false;
    }
    public boolean canJump(int[] nums) {
        Boolean[] dp = new Boolean[nums.length];
        return check(nums,dp,0);
    }
}