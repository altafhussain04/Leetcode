class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();


        for(char ch:num.toCharArray()){
            while(!st.isEmpty() && k>0 && st.peek() > ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }

        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }

        ans.reverse();

        int index=0;
        while(index<ans.length() && ans.charAt(index)=='0'){
            index++;
        }

        String result=ans.substring(index);

        return result.isEmpty() ? "0" : result;

        
    }
}