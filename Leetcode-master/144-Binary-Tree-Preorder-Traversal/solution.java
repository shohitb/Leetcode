/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        while(node != null){
            result.add(node.val);
            if(node.right != null){
                stack.push(node.right);
            }
            node = node.left;
            
            if(node==null && !stack.isEmpty()){
                node = stack.pop();
            }
        }
        return result;
    }
}