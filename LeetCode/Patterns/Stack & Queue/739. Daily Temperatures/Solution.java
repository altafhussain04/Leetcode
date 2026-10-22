class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] arr=new int[n];
        int i=0;
        Stack<Integer> st=new Stack<>();
        while(i<n){
           
            if( !st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                arr[st.peek()]=i-st.peek();
                st.pop();
                
            }
            else{
                st.push(i);
                i++;
            }
            
        }
        return arr;
        
      
        
    }
}