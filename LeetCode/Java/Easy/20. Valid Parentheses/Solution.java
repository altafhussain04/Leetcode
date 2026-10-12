class Solution {
    public boolean isValid(String s) {

        int sLength=s.length();

        Stack<Character> st=new Stack<>();

        for(int i=0; i<sLength; i++){

            char cur=s.charAt(i);

            if(cur=='('){
                st.push('(');
            }
            else if(cur=='['){
                st.push('[');


            }
            else if(cur=='{'){
                st.push('{');
            }

            else if(cur==')' && st.peek()=='('){
                st.pop();
            }

            else if(cur=='}' && st.peek()=='{'){
                st.pop();

            }
            else if(cur==']' && st.peek()=='['){
                st.pop();
            }
        }

        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }

        
        
    }
}