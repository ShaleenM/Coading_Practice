package Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Mathurs on 10/8/16.
 */
public class RightViewOfTree {

    public static void rightViewOfTree(BinaryTreeNode root){
        if(root == null)
            return;

        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){

            BinaryTreeNode node = queue.remove();

            if(node == null) {
                queue.add(null);
                continue;
            }

            if(node.getLeft() != null)
                queue.add(node.getLeft());
            if(node.getRight() != null)
                queue.add(node.getRight());


            if(queue.peek() == null){
                System.out.println(node.getData() + "\t");
            }
        }
    }
}
