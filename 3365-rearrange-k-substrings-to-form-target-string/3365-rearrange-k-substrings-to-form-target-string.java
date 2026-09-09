class Solution {
    public boolean isPossibleToRearrange(String s, String t, int k) {
        int n=s.length();
        int len=n/k;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<n;i+=len){
            String sb = s.substring(i,i+len);
            map.put(sb,map.getOrDefault(sb,0)+1);
        }
        for(int i=0;i<n;i+=len){
            String sb = t.substring(i,i+len);
            if(!map.containsKey(sb)) return false;
            int num = map.get(sb);
            if(num==1){
                map.remove(sb);
            }else{
                map.put(sb,num-1);
            }
        }
        return true;
    }
}