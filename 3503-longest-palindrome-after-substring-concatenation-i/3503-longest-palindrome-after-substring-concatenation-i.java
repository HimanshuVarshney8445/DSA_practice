class Solution {
    public boolean isPal(String s){
        char[] str = s.toCharArray();
        int i=0,j=str.length-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public int longestPalindrome(String s, String t) {
        int max=0;
        for(int i=0;i<=s.length();i++){
            for(int j=i;j<=s.length();j++){
                String s1 = s.substring(i,j);
                for(int k=0;k<=t.length();k++){
                    for(int l=k;l<=t.length();l++){
                        String s2 = t.substring(k,l);
                        String temp = s1+s2;
                        if(isPal(temp)){
                            max=Math.max(max,temp.length());
                        } 
                    }
                }
            }
        }
        return max;
    }
}