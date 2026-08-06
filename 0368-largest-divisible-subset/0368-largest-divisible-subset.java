class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int[] prev = new int[n];
        int lastIndex=0;
        int max=0;
        for(int i=0;i<n;i++){
            prev[i]=i;
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && dp[i]<dp[j]+1){
                    dp[i]=1+dp[j];
                    prev[i]=j;
                }
            }
            if(dp[i]>max){
                lastIndex=i;
                max=dp[i];
            }
        }
        int i=lastIndex;
        while(prev[i]!=i){
            list.add(nums[i]);
            i=prev[i];
        }
        list.add(nums[i]);
        return list;
    }
}