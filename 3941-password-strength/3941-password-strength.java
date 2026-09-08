class Solution {
    public int passwordStrength(String password) {
        Set<Character> set = new HashSet<>();
        int count=0;
        for(char ch : password.toCharArray()){
            if(set.contains(ch)) continue;
            set.add(ch);
            if(ch>='a' && ch<='z') count+=1;
            else if(ch>='A' && ch<='Z') count+=2;
            else if(ch>='0' && ch<='9') count+=3;
            else count+=5;
        }
        return count;
    }
}