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
    public List<Double> averageOfLevels(TreeNode root) {

        ArrayList<Double> li = new ArrayList<>();
        if(root == null){
            return li;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
     

        while(!q.isEmpty()){


            int size = q.size();
             double sum = 0;

            for(int i=0;i<size;i++){

                TreeNode n1 = q.poll();

                sum += n1.val;

                if(n1.left!=null){

                    q.add(n1.left);
                }

                if(n1.right != null){

                    q.add(n1.right);
                }




            }

            li.add(sum/size);
            
     }

     return li;
        
    }
}