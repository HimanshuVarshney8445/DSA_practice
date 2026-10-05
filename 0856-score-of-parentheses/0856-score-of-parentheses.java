class Solution {
    public int scoreOfParentheses(String s) {
        int count=0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(') st.push(0);
            else{
                if(!st.isEmpty()){
                    int inside = st.pop();
                    int score;
                    if(inside==0) score=1;
                    else score = 2*inside;
                    if(!st.isEmpty()){
                        st.push(st.pop()+score);
                    }else count+=score;
                }
            }
        }
        return count;
    }
}