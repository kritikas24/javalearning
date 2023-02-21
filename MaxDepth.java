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
 
 //Problem 104
class MaxDepth {
    public int maxDepth(TreeNode root) {
        //counter to count child element
         return (root == null)?0:1+Math.max(maxDepth(root.left),maxDepth(root.right));

    }
}