class Solution {
    public boolean find(String s,String t){
        if(s.length()<t.length()) return false;
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)!=t.charAt(j)) return false;
            i++;
            j++;
        }
        return true;
    }
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] str = sentence.split(" ");
        for(int i=0;i<str.length;i++){
            if(find(str[i],searchWord)) return i+1;
        }
        return -1;
    }
}