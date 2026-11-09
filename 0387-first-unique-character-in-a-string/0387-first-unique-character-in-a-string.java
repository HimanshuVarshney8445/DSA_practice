class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char ans='A';
        for(char ch :map.keySet()){
            if(map.get(ch)==1){
                ans=ch;
                break;
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ans) return i;
        }
        return -1;
    }
}