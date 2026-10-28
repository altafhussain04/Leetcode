
class Solution {
    boolean SameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return SameTree(p.left, q.left) &&
               SameTree(p.right, q.right);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return SameTree(p, q);
    }
}
