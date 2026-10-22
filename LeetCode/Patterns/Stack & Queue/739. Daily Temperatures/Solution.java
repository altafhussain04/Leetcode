class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] arr=new int[n];
        
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<n; i++){
            int count=1;
            int j=i+1;
            while(j<n){
                if(temperatures[j]>temperatures[i]){
                    arr[i]=count;
                    break;
                }
                else{
                    count++;
                }
                j++;
            }
            if(j>=n){
                
                arr[i]=0;
            }
        }
        return arr;


        
        
    }
}