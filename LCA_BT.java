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
        if(root==null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        return left == null ? right : right==null ? left : root;
        
    }
}
        
        
        
        
        
//         TreeNode lca = null;
        
//         if (root.val==p.val || root.val==q.val){
//             lca = root;
//         }else{
//             boolean left = containsNodes(root.left,p,q);
//             boolean right = containsNodes(root.right,p,q);
//             if( left && right){
//                 lca = root;
//             }else if(!left && right){
//                 lca =  lowestCommonAncestor(root.right,p,q);
//             }else if(left && !right){
//                 lca =  lowestCommonAncestor(root.left,p,q);
//             }
//         }
        
//         return lca;
//     }
    
//     public boolean containsNodes(TreeNode root, TreeNode p, TreeNode q){
//         boolean result;
//         if(root!=null){
//             if (root.val==p.val || root.val==q.val){
//                 result = true;
//             }else{
//                 result = containsNodes(root.left,p,q);
//                 if(!result){
//                     result = containsNodes(root.right,p,q);
//                 }
//             }
//         }else{
//             result = false;
//         }
//         return result;
//     }
// }