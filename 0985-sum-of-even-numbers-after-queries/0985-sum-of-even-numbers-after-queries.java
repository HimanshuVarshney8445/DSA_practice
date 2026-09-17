class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0) sum+=nums[i];
        }
        int[] arr = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int n1 = queries[i][0];
            int n2 = queries[i][1];
            if(nums[n2]%2==0) sum-=nums[n2];
            nums[n2]=nums[n2]+n1;
            if(nums[n2]%2==0) sum+=nums[n2];
            arr[i]=sum;   
        }
        return arr;
    }
}