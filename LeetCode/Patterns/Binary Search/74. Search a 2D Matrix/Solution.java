class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int initial=0;
        int last=m-1;

        while(initial<=last){
            int mid=initial+(last-initial)/2;
            int st=0;
            int end=n-1;
            while(st<=end){
                int centre=st+(end-st)/2;
                if(matrix[mid][centre]==target){
                    return true;
                }
                else if(matrix[mid][centre]<target){
                    st=centre+1;
                }
                else{
                    end=centre-1;
                }
            }
            if( target > matrix[mid][n-1]){
                initial=mid+1;
            }
             else if(target < matrix[mid][0]){
                last=mid-1;
            }
            else{
                return false;
            }
            
        }
        return false;

        
        
    }
}