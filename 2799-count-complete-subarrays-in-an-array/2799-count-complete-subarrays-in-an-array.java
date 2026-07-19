class Solution {
    public int countCompleteSubarrays(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:nums){
            if(!list.contains(i)) list.add(i);
        }
        Map<Integer,Integer> map = new HashMap<>();
        int num=list.size();
        int j=0,count=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.size()==num){
                count+=nums.length-i;
                map.put(nums[j],map.get(nums[j])-1);
                if(map.get(nums[j])==0) map.remove(nums[j]);
                j++;
            }
        }
        return count;
    }
}