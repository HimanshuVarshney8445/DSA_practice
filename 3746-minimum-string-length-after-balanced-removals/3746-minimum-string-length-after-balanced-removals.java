class Solution {
    public int minLengthAfterRemovals(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a'){
                if(!st.isEmpty() && st.peek()=='b') st.pop();
                else st.push(ch);
            }else{
                if(!st.isEmpty() && st.peek()=='a'){
                    st.pop();
                }else st.push(ch);
            }
        }
        return st.size();
    }
}