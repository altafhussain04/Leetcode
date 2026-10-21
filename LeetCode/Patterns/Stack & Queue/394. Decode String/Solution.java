class Solution {
    public String decodeString(String s) {
        Stack<Integer> CountStack=new Stack<>();
        Stack<StringBuilder> StringStack=new Stack<>();
        int number=0;
        StringBuilder curr=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                number=number*10+(ch-'0');

            }
            else if(ch=='['){
                CountStack.push(number);
                StringStack.push(curr);
                number=0;
                curr=new StringBuilder();

            }
            else if(ch==']'){
                int repeatcount=CountStack.pop();
                StringBuilder prev=StringStack.pop();
                for(int i=1; i<=repeatcount; i++){
                    prev.append(curr);

                }
                curr=prev;

            }
            else{
                curr.append(ch);
            }
        }
        return curr.toString();

        
    }
}