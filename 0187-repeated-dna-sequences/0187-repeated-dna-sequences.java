class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeat = new HashSet<>();
        for(int i=0;i<=s.length()-10;i++){
            String res = s.substring(i,i+10);
            if(seen.contains(res)) repeat.add(res);
            else seen.add(res);
        }
        return new ArrayList<>(repeat);
    }
}