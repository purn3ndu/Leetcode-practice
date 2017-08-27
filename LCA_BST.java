/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        // see if the val of the root lies between the two nodes p and q. 
        // i.e. if root.val >=p and root.val<=q then return root
        //
        
        while(root.val!=p.val && root.val!=q.val){
            if ((root.val>p.val && root.val<q.val) || (root.val<p.val && root.val>q.val)){
                break;
            }else if(root.val>p.val && root.val>q.val){
                root = root.left;
            }else{
                root = root.right;
            }
        }
        return root;
        
    }
}