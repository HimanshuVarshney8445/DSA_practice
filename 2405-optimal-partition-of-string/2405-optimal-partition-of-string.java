class Solution {
    public int partitionString(String s) {
        int count=1;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
            }else{
                count++;
                set.clear();
                set.add(ch);
            }
        }
        return count;
    }
}