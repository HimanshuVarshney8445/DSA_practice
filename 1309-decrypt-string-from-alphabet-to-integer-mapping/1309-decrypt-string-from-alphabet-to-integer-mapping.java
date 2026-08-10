class Solution {
    public String freqAlphabets(String s) {
        int i=s.length()-1;
        StringBuilder sb = new StringBuilder();
        while(i>=0){
            if(s.charAt(i)=='#'){
                int num = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');
                sb.append((char)('a'+num-1));
                i-=3;
            }else{
                int num = s.charAt(i)-'0';
                sb.append((char)('a'+num-1));
                i--; 
            }
        }
        return sb.reverse().toString();
    }
}