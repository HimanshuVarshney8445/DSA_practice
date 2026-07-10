class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> t: map.entrySet()){
            int n1 = t.getKey();
            int n2 = t.getValue();
            if(n2==1){
                if(!(map.containsKey(n1+1) || map.containsKey(n1-1))) list.add(n1);
            }
        }
        return list;
    }
}