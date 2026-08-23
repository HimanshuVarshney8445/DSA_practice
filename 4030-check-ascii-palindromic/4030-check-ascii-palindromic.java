class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            String str = String.format("%8s", Integer.toBinaryString(ch)).replace(' ', '0');
            sb.append(str);
        }
        String ans = sb.toString();
        int i=0,j=ans.length()-1;
        while(i<=j){
            if(ans.charAt(i)!=ans.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
