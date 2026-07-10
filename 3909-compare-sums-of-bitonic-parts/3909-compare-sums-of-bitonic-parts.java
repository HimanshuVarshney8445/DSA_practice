class Solution {
    public int compareBitonicSums(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                temp=i;
                break;
            }
        }
        long asc=0,dsc=0;
        for(int i=0;i<=temp;i++){
            asc+=nums[i];
        }
        for(int i=temp;i<nums.length;i++){
            dsc+=nums[i];
        }
        if(asc==dsc) return -1;
        else if(dsc>asc) return 1;
        return 0;
    }
}