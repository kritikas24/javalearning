
// Definition for a binary tree node

// Problem 104


class MaxDepth {
	public int maxDepth(TreeNode root) {
		// counter to count child element
		return (root == null) ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

	}
}