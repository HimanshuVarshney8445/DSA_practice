class Solution {
    public String smallestPalindrome(String s) {
        int[] temp = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            temp[ch-'a']++;
        }
        char middle = 0;
        StringBuilder left = new StringBuilder();
        for(int i=0;i<26;i++){
            if(temp[i]>0){
                char ch = (char)(i+'a');
                for(int j=0;j<temp[i]/2;j++){
                    left.append(ch);
                }
                if(temp[i]%2==1) middle=ch;
            }
        }
        StringBuilder right = new StringBuilder(left).reverse();
        StringBuilder ans = new StringBuilder(left);
        if(middle!=0) ans.append(middle);
        ans.append(right);
        return ans.toString();
    }
}