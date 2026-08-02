class Solution {
    public int find(int idx,String s,HashSet<String> set){
        if(idx==s.length()) return 0;
        int max=0;
        for(int i=idx+1;i<=s.length();i++){
            String substring = s.substring(idx,i);
            if(!set.contains(substring)){
                set.add(substring);
                max=Math.max(max,1+find(i,s,set));
                set.remove(substring);
            }
        }
        return max;
    }
    public int maxUniqueSplit(String s) {
        return find(0,s,new HashSet<>());
    }
}