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
    private void levelOrderTraversal(TreeNode root, List<List<Integer>> ans) {
        if (root == null) {
            return;
        }
        Queue <TreeNode> q = new LinkedList<>();

        q.offer(root);
        q.offer(null);
        ArrayList <Integer> list = new ArrayList<>();

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr == null) {
                ans.add(list);

                if (q.isEmpty()) {
                    break;
                }
                else {
                    list = new ArrayList<>();
                    q.offer(null);
                    continue;
                }
            }

            list.add(curr.val);

            if (curr.left != null) {
                q.offer(curr.left);
            }
            if (curr.right != null) {
                q.offer(curr.right);
            }
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        levelOrderTraversal(root, list);
        return list;
    }
}