class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n=nums.size();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
        }
        int key=0,value=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() > n/2){
                key=entry.getKey();
                value=entry.getValue();
                break;
            }
        }
        int leftCount=0;
        for(int i=0;i<n-1;i++){
            if(nums.get(i)==key) leftCount++;
            int left=i+1;
            int right=n-left;
            int rightCount=value-leftCount;
            if(leftCount>left/2 && rightCount>right/2) return i;
        }
        return -1;
    }
}