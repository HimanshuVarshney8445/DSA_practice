class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        int minLen=Integer.MAX_VALUE;
        int start=0,i=0;
        int req=t.length();
        int[] freq = new int[128];
        for(char c:t.toCharArray()) freq[c]++;
        for(int j=0;j<s.length();j++){
            char ch = s.charAt(j);
            if(freq[ch]>0){
                req--;
            }
            freq[ch]--;
            while(req==0){
                int len = j-i+1;
                if(len<minLen){
                    minLen=len;
                    start=i;
                }
                char leftChar = s.charAt(i);
                freq[leftChar]++;
                if(freq[leftChar]>0){
                    req++;
                }
                i++;
            }
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    }
}