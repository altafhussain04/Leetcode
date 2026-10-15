class Solution {
    public int longestValidParentheses(String s) {
        
        Stack<Character> st=new Stack<>();
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch==')'){
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                    count=count+2;

                }
                else{
                    st.push(ch);

                }
            }
            else{
                st.push(ch);
            }
           
        }
        return count;
    }
}