class Solution {
    public int countGoodSubstrings(String s) {
        int j=0,count=0;
        for(int i=0;i<s.length();i++){
            if(i-j+1==3){
                if(s.charAt(j)!=s.charAt(j+1) && s.charAt(j+1)!=s.charAt(j+2) && s.charAt(j+2)!=s.charAt(j)) count++;
                j++;
            }
        }
        return count;
    }
}