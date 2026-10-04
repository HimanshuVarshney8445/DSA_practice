class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> star = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(') st1.push(i);
            else if(ch=='*') star.push(i);
            else if(ch==')'){
                if(!st1.isEmpty()){
                    st1.pop();
                }else if(!star.isEmpty()) star.pop();
                else return false;
            }
        }
        while (!st1.isEmpty() && !star.isEmpty()) {
            int openIndex = st1.pop();
            int starIndex = star.pop();
            if (openIndex > starIndex) {
                return false;
            }
        }
        return st1.isEmpty();
    }
}