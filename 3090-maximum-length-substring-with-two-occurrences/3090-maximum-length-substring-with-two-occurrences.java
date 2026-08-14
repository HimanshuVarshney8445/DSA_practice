class Solution {
    public int maximumLengthSubstring(String s) {
        int j=0,count=0;
        int[] temp = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            temp[ch-'a']++;
            while(temp[ch-'a']>2){
                char a = s.charAt(j);
                temp[a-'a']--;
                j++;
            }
            count=Math.max(count,i-j+1);
        }
        return count;
    }
}