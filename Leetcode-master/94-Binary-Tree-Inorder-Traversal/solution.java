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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        TreeNode node = root;
        
        
        while(node!=null || !stack.empty()){
            
            while(node!=null){
                stack.add(node);
                node = node.left;
            }
            node = stack.pop();
            result.add(node.val);
            node = node.right;
        }
        
        return result;
    }
}