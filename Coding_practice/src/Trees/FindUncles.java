package Trees;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Mathurs on 10/10/16.
 */
public class FindUncles {

    public static void findUncles(BinaryTreeNode root, BinaryTreeNode target){

        if(target == root)
            System.out.println("No Parents for this node");

        boolean foundtarget = false;
        BinaryTreeNode parent = null;
        List<BinaryTreeNode> list = new LinkedList<BinaryTreeNode>();
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){

            BinaryTreeNode node = queue.remove();

            if(node == null){

                if(foundtarget)
                    break;

                list = new LinkedList<BinaryTreeNode>();

                if(queue.isEmpty())
                    break;

                queue.add(null);
            }
            else {

                if (node.getLeft() == target || node.getRight() == target) {
                    parent = node;
                    foundtarget = true;
                }

                if (node.getLeft() != null)
                    queue.add(node.getLeft());
                if (node.getRight() != null)
                    queue.add(node.getRight());

                if (node != parent)
                    list.add(node);
            }

        }

        if(foundtarget){
            for(int i = 0 ; i < list.size() ; i++)
                System.out.println(list.get(i).getData() + "  ");
        }
        else{
            System.out.println("No such element found");
        }
    }
}
