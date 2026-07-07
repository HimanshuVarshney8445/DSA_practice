class Solution {
    public int scoreDifference(int[] nums) {
        boolean flag=true;
        int first=0,second=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                flag=!flag;
            }
            if((i+1)%6==0){
                flag=!flag;
            }
            if(flag){
                first+=nums[i];
            }else{
                second+=nums[i];
            }
        }
        return first-second;
    }
}