/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    boolean Balance=true;
    boolean B=true;
    int checkBalance(TreeNode  root){
        if(root==null){
            return 0;

        }
        int Left=checkBalance(root.left);
        int Right=checkBalance(root.right);
        if(Math.abs(Left-Right)>1){
             B=false;
            
        }
        Balance=(Balance && B);
       
        return Math.max(Left,Right)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        checkBalance(root);
        return Balance;
        
    }
}