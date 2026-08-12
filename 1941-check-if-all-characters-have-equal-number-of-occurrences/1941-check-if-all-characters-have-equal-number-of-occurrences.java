class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] temp = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            temp[ch-'a']++;
        }
        int freq=0;
        for(int i=0;i<26;i++){
            if(temp[i]>0){
                freq=temp[i];
                break;
            }
        }
        for(int i=0;i<26;i++){
            if(temp[i]>0 && freq!=temp[i]) return false;
        }
        return true;
    }
}