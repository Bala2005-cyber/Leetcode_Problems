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
    public int maxDepth(TreeNode root) {

        if(root==null){

            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int depth = 1;

        while(!q.isEmpty()){

            int size = q.size();

            for(int i=0;i<size;i++){
              
              TreeNode n1 = q.poll();
              
              if(n1.left!=null){

                q.add(n1.left);
              }

              if(n1.right!=null){
               
               q.add(n1.right);

             }


             


            }

            depth++;
        }

        return depth-1;
        
        
    }
}