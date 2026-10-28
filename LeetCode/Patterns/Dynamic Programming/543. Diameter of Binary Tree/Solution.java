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
    int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int Left=height(root.left);
        int Right=height(root.right);
        return Math.max(Left,Right)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {

         int RightHeight=0;
         int LeftHeight=0;


        if(root.left!=null){
             LeftHeight=height(root.left);
        }
        if(root.right!=null){
             RightHeight=height(root.right);
        }

        return LeftHeight+RightHeight;

        

        
    }
}