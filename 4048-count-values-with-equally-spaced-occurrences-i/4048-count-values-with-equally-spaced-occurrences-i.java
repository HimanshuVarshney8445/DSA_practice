class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        int count=0;
        for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()){
            int key = entry.getKey();
            ArrayList<Integer> list = entry.getValue();
            if(list.size()==3 && (list.get(0)+list.get(2) == 2*list.get(1))) count++;
        }
        return count;
    }
}