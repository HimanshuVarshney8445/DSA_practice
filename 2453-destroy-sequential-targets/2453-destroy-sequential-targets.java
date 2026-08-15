class Solution {
    public int destroyTargets(int[] nums, int space) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            num=num%space;
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max = Collections.max(map.values());
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i]%space)==max) return nums[i];
        }
        return 0;
    }
}