class Solution {
    public int numberOfSubstrings(String s) {
        int j=0;
        int count=0;
        HashMap<Character,Integer> map = new HashMap();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            while(map.getOrDefault('a',0)>=1 && map.getOrDefault('b',0)>=1 && map.getOrDefault('c',0)>=1){
                count+=s.length()-i;
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j++),0)-1);
            }
        }
        return count;
    }
}