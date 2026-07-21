class Solution {
    public int arrayNesting(int[] nums) {
        int max=0;
        boolean[] arr = new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            if(arr[i]) continue;
            int count=0;
            int idx=i;
            while(!arr[idx]){
                arr[idx]=true;
                idx=nums[idx];
                count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}