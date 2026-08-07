class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        while(n!=0){
            int r=n%10;
            map.put(r,map.getOrDefault(r,0)+1);
            n/=10;
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> temp : map.entrySet()){
            int key = temp.getKey();
            int value = temp.getValue();
            sum+=(key*value);
        }
        return sum;
    }
}