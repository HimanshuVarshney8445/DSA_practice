class Solution {
    public String breakPalindrome(String p) {
        if(p.length()==1) return "";
        StringBuilder sb = new StringBuilder(p);
        for(int i=0;i<p.length()/2;i++){
            if(p.charAt(i)!='a'){
                sb.setCharAt(i,'a');
                return sb.toString();
            }
        }
        sb.setCharAt(p.length() - 1, 'b');
        return sb.toString();
    }
}