class Solution {
    public int maxPower(String s) {
        int max=1,count=1;
        char prev = s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=prev){
                count=1;
                prev=s.charAt(i);
            }else count++;
            max=Math.max(max,count);
        }
        return max;
    }
}