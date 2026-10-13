class Solution {
    public int minAddToMakeValid(String s) {

        int len=s.length();

        Stack<Character> st=new Stack<>();
        int count=0;

        for(int i=0; i<len; i++){

            if(s.charAt(i)=='('){
                st.push('(');
                

            }
            else{
                if(st.isEmpty() ){

                     
                     count++;


                   
                }
                else{
                    st.pop();
                   
                }
                
                
            }

            
        }
        while(!st.isEmpty()){
            st.pop();
            count++;
        }
        return count;

       
    }
}