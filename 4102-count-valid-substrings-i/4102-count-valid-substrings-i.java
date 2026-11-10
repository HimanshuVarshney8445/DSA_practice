class Solution {
    public long countValidSubstrings(String s) {
        int j=0;
        long count=0;
        for(int i=0;i<s.length();i++){
            if(i>=2 && s.substring(i-2,i+1).equals("abc")) j=i-1;
            count+=(i-j+1);
        }
        return count;
    }
}