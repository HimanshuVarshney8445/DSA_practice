class Solution {
    public int countValidPrefixes(String s) {
        int zero=0,one=0,count=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='0') zero++;
            else one++;
            if(Math.abs(zero-one)<=1) count++;
        }
        return count;
    }
}