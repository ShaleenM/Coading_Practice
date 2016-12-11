import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Mathurs on 11/30/16.
 */
public class FindLeavesofBinaryTree {

    /**
     * Definition for a binary tree node.
     * */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<List<Integer>> findLeaves(TreeNode root){

        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;

        getHeight(root, result);
        return result;
    }

    private int getHeight(TreeNode root, List<List<Integer>> result){

        int height = 0;
        if(root.left == null && root.right == null);
        else if(root.left != null)
            height = getHeight(root.left, result) + 1;
        else if(root.left != null)
            height = getHeight(root.right, result) + 1;
        else
            height = Math.max(getHeight(root.left,result) , getHeight(root.right , result)) +1;

        if(result.size() < height)
            result.add(new ArrayList<Integer>());

        result.get(height).add(root.val);
        return height;
    }
}


