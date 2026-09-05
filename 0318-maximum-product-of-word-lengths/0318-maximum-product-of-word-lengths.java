class Solution {
    public boolean valid(String s1,String s2){
        int[] ch1 = new int[26];
        int[] ch2 = new int[26];
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            ch1[ch-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            ch2[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(ch1[i] > 0 && ch2[i] > 0) return false;
        }
        return true;
    }
    public int maxProduct(String[] words) {
        int ans=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if(valid(words[i],words[j])){
                    ans=Math.max(ans,(words[i].length() * words[j].length()));
                }
            }
        }
        return ans;
    }
}