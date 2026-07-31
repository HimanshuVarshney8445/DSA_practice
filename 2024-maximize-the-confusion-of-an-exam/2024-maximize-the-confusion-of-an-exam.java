class Solution {
    public int find(String s,int k,int target){
        int i=0,count=0,change=0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)!=target) change++;
            while(change>k){
                if(s.charAt(i)!=target) change--;
                i++;
            }
            count=Math.max(count,j-i+1);
        }
        return count;
    }
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(find(answerKey,k,'T'),find(answerKey,k,'F'));
    }
}