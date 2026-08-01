class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        while(true){
            List<Integer> temp = new ArrayList<>();
            for(int key : map.keySet()){
                if (map.get(key) > 0) {
                    temp.add(key);
                    map.put(key, map.get(key) - 1);
                }
            }
            if(temp.size()==0) break;
            list.add(temp);
        }
        return list;
    }
}