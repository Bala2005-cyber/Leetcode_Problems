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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> l = new ArrayList<>();
        if (root == null) {
            return l;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<Integer> a = new ArrayList<>();
        a.add(root.val);
        l.add(a);
        while (!q.isEmpty()) {
            int size = q.size();
            
            List<Integer> ls = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode n1 = q.poll();
                if (n1.left != null) {
                   // System.out.println(n1.left.val);
                    q.add(n1.left);
                    ls.add(n1.left.val);
                }
                if (n1.right != null) {
                 //   System.out.println(n1.right.val);
                    q.add(n1.right);
                    ls.add(n1.right.val);
                }
            }
           // System.out.println("next iteration");
           if(!ls.isEmpty()){
                l.add(ls);
           }
            

        }

        return l;

    }
}