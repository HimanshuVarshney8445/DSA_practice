class Solution {
    public long findMaximumScore(List<Integer> nums) {
        long ans=0,max=0;
        for(int i=0;i<nums.size()-1;i++){
            max=Math.max(max,nums.get(i));
            ans+=max;
        }
        return ans;
    }
}