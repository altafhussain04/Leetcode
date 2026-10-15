class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty()){
                if(st.peek()==ch){
                    st.pop();

                }
                else{
                    st.push(ch);

                
                }

            }
            else{
                st.push(ch);

            }
        }

        StringBuilder Str=new StringBuilder();

        while(!st.isEmpty()){
            Str.append(st.peek());
            st.pop();

        }
        return Str.reverse().toString();
        
    }
}