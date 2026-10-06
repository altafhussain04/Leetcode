class Solution {
    public int minAddToMakeValid(String s) {

        int len=s.length();

        Stack<Character> st=new Stack<>();
        int count=0;

        for(int i=0; i<len; i++){

            if(s.charAt(i)=='('){
                st.push('(');
                count++;

            }
            else{
                if(st.isEmpty() || st.peek()==')'){

                     st.push(')');
                     count++;


                   
                }
                else{
                    st.pop();
                    count--;
                }
                
                
            }

            
        }
        return count;

       
    }
}