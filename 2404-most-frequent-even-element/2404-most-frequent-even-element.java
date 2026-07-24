class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] arr = new int[100001];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int max=0;
        int ans = -1;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i] && i%2==0){
                max=arr[i];
                ans=i;
            }
        }
        return max==0 ? -1 : ans;
    }
}