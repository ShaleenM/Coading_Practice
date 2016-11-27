package Trees;

import sun.jvm.hotspot.interpreter.BytecodeInstanceOf;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Mathurs on 9/24/16.
 */
public class TreeTraversal {

    public static void preOrderTraversal(BinaryTreeNode root){

        if(root == null) return;

        //Processing root
        System.out.println(root.data);

        //Processing left subtree
        preOrderTraversal(root.getLeft());

        //Processing right subtree
        preOrderTraversal(root.getRight());
    }

    public static void preOrderTraversalItr(BinaryTreeNode root){

        if(root == null) return;

        BinaryTreeNode node = root;
        Stack<BinaryTreeNode> stack  = new Stack<BinaryTreeNode>();

        stack.push(root.getRight());

        while(!stack.empty()){

            while(node != null){
                System.out.print(node.getData());
                if(node.getRight() != null)
                    stack.push(node.getRight());

                node = node.getLeft();
            }

            node = stack.pop();
        }
    }

    public static void inOrderTraversal(BinaryTreeNode root){
        if(root == null ) return;

        // Traverse Left sub tree inOrder
        inOrderTraversal(root.getLeft());

        // Process root
        System.out.println(root.getData());

        // Traverse Right sub tree inOrder
        inOrderTraversal(root.getRight());
    }

    public static void inOrderTraversalItr(BinaryTreeNode root){
         if(root == null ) return;

        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        BinaryTreeNode node = root;

        while(true){

            while(node != null){
                stack.push(node);
                node = node.getLeft();
            }

            if(stack.empty())
                break;

            node = stack.pop();
            System.out.println(node.getData());
//            if(!stack.empty()) {
//                node = stack.pop();
//                System.out.println(node.getData());
//            }
            node = node.getRight();
        }

    }

    public static void postOrderTraversalItr(BinaryTreeNode root){

        System.out.println("postOrderTraversalItr");
        if(root == null ) return;

        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        BinaryTreeNode node = root;

        while(true){

            while(node != null){
                stack.push(node);
                node = node.getLeft();
            }


            while(!stack.empty() && stack.peek().getRight() == null){
                node = stack.pop();
                System.out.println(node.getData());

                if(stack.peek().getRight() == node){
                    node = stack.pop();
                    System.out.println(node.getData());
                }
            }

            if(!stack.empty() && stack.peek().getRight() != null) {
                node = stack.peek().getRight();
            }

            if(stack.empty())
                break;
        }
    }

    public static void levelOrderTraversalItr(BinaryTreeNode root){
        if(root == null) return;

        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        BinaryTreeNode node = root;
        queue.add(node);

        while(!queue.isEmpty()){
            node = queue.element();
            if(node.getLeft() != null)
                queue.add(node.getLeft());

            if(node.getRight() != null)
                queue.add(node.getRight());

            System.out.println(node.getData());
            queue.remove();
        }
    }


}
