class Solution {
    public int minimumPushes(String word) {
        int[] ch = new int[26];
        for(int i=0;i<word.length();i++){
            ch[word.charAt(i)-'a']++;
        }
        int count=0,idx=0;
        Arrays.sort(ch);
        for(int i=25;i>=0;i--){
            int temp = (idx/8)+1;
            count+=temp*ch[i];
            idx++;
        }
        return count;
    }
}