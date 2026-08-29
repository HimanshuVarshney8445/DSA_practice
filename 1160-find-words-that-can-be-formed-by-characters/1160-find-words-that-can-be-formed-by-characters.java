class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] target = new int[26];
        for(int i=0;i<chars.length();i++){
            char ch = chars.charAt(i);
            target[ch-'a']++;
        }
        int count = 0;
        for(int i=0;i<words.length;i++){
            String str = words[i];
            int[] temp = new int[26];
            for(int j=0;j<str.length();j++){
                char t = str.charAt(j);
                temp[t-'a']++;
            }
            boolean flag=true;
            for(int k=0;k<26;k++){
                if(temp[k]>target[k]){
                    flag=false;
                    break;
                }
            }
            if(flag) count+=(str.length());
        }
        return count;
    }
}