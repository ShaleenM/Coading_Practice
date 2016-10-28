import java.util.Stack;

/**
 * Created by Mathurs on 10/28/16.
 *
 * Given a binary tree, flatten it to a linked list in-place.

 For example,
 Given

         1
        / \
       2   5
      / \   \
     3   4   6
 The flattened tree should look like:
  1-2-3-4-5-6

 */
public class BTreeToLinkedList {

    /**
     * Definition for a binary tree node.
     * */
     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }

    public class Solution {
        public void flatten(TreeNode root) {

            if( root == null)
                return;

            Stack<TreeNode> stack = new Stack<TreeNode>();
            TreeNode node = root;


            while(true){

                while(node != null){
                    if(node.right != null)
                        stack.push(node.right);
                    if(node.left != null){
                        node.right = node.left;
                        node.left = null;
                        node = node.right;
                    }
                    else{
                        break;
                    }
                }

                if(stack.isEmpty())
                    break;

                node.right = stack.pop();

                node = node.right;

            }

            return;
        }
    }
}
