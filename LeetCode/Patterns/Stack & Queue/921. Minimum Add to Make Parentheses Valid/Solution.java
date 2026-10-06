class Solution {
    public int minAddToMakeValid(String s) {

        int Leftcount=0;
        int Rightcount=0;
        int length=s.length();
        for(int i=0; i<length; i++){
             char parenthesis=s.charAt(i);
             if(parenthesis=='('){
                Leftcount++;
             }
             else{
                Rightcount++;
             }
             

        }
        int required=Math.abs(Leftcount-Rightcount);

        return required;
        
    }
}