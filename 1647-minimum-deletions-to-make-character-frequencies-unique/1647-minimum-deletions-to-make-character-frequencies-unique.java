class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        int count=0;
        for(int frq : map.values()){
            while(frq>0 && set.contains(frq)){
                frq--;
                count++;
            }
            if(frq>0){
                set.add(frq);
            }
        }
        return count;
    }
}