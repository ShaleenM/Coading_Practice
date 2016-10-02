package Trees;

import java.util.*;

/**
 * Created by Mathurs on 9/26/16.
 */
public class BinaryTreeAlgos {

    public static int findMax(BinaryTreeNode root){
        if(root == null) return Integer.MIN_VALUE;

        return Math.max(root.data, Math.max(findMax(root.getLeft()), findMax(root.getRight()))) ;

    }

    public static int findMaxItr(BinaryTreeNode root){
        if(root == null) return Integer.MIN_VALUE;

        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        BinaryTreeNode node = root;
        int maxVal = Integer.MIN_VALUE;

        while(true){

            while(node != null){
                maxVal = node.getData() > maxVal ? node.getData() : maxVal;
                if(node.getRight() != null)
                    stack.push(node.getRight());

                node = node.getLeft();
            }

            node = stack.pop();

            if(stack.empty())
                break;
        }

        return maxVal;
    }


    public static boolean search(int val, BinaryTreeNode root){
        if(root == null) return false;

        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        BinaryTreeNode node = root;
        queue.add(node);

        while(!queue.isEmpty()){
            node = queue.remove();
            if(node.getData() == val)
                return true;

            if(node.getLeft() !=  null)
                queue.add(node.getLeft());

            if(node.getRight() != null)
                queue.add(node.getRight());
        }

        return false;
    }

    public static void reverseLevelOrderPrint(BinaryTreeNode root){
        if(root == null) return;

//        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        ArrayList<BinaryTreeNode> queue = new ArrayList<BinaryTreeNode>();
        int i = 0;
        BinaryTreeNode node = root;
        queue.add(node);

        while(i < queue.size()){
            node = queue.get(i++);

            if(node.getLeft() != null)
                queue.add(node.getLeft());

            if(node.getRight() != null)
                queue.add(node.getRight());
        }


        for(i = queue.size() -1 ; i >= 0 ; i--){
            System.out.println(queue.get(i).getData());
        }
    }

    public static int getHeight(BinaryTreeNode root){

        if(root == null) return 0;

        if(root.getLeft() != null && root.getRight() != null)
            return Math.max(getHeight(root.getLeft()), getHeight(root.getRight())) + 1;
        else if(root.getLeft() != null)
                return getHeight(root.getLeft()) +1;
        else if(root.getRight() != null)
            return getHeight(root.getRight()) + 1;
        else
            return 1;
    }

    public static int diameter = Integer.MIN_VALUE;

    public static int findDiameter(BinaryTreeNode root){

        if(root == null) return 0;

        int left = findDiameter(root.getLeft());
        int right = findDiameter(root.getRight());

        if(left + right + 1 > diameter )
            diameter = left + right + 1;

        return Math.max(left , right) + 1;

    }

    public static int levelWithMaxSum(BinaryTreeNode root){

        if(root == null) return 0;

        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        BinaryTreeNode node = root;
        BinaryTreeNode temp;
        int maxSum = 0 , sum = 0;
        int maxLevel = 0, level = 0;

        queue.add(node);
        queue.add(null);
        level++;

        while(!queue.isEmpty()){

            temp = queue.remove();

            if(temp != null) {

                sum += temp.getData();
                if (temp.getLeft() != null)
                    queue.add(temp.getLeft());

                if (temp.getRight() != null)
                    queue.add(temp.getRight());
            }
            else{
                if(sum > maxSum){
                    maxSum = sum;
                    maxLevel = level;
                }

                level++;
                sum = 0;
                if(!queue.isEmpty())
                    queue.add(null);
            }
        }

        return maxLevel;
    }

    public static void printLeafPaths(BinaryTreeNode root){

        if(root == null) return;

        printLeafPaths(root , "");

    }

    public static void printLeafPaths(BinaryTreeNode root , String pathSoFar){

        if(root == null) return;

        if(root.getLeft() == null && root.getRight() == null){
            System.out.println(pathSoFar + "--> "+ root.getData());
            return;
        }
        if(root.getLeft() != null){
            printLeafPaths(root.getLeft() , pathSoFar + "--> "+ root.getData());
        }

        if(root.getRight() != null){
            printLeafPaths(root.getRight() , pathSoFar + "--> "+ root.getData());
        }
    }

    public static BinaryTreeNode LCA(BinaryTreeNode root, BinaryTreeNode node1 , BinaryTreeNode node2){

        if(root == null)
            return root;

        if(root == node1 || root == node2)
            return root;

        BinaryTreeNode left = LCA(root.getLeft() , node1 , node2);
        BinaryTreeNode right = LCA(root.getRight() , node1 , node2);

        if(left != null && right != null)
            return root;
        else if(left != null)
            return root.getLeft();
        else if(right != null)
            return root.getRight();
        else
            return null;
    }

//    public static void printPath(BinaryTreeNode root , BinaryTreeNode alpha){
//
//        if(root == null || alpha == null) return;
//
//        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
//        BinaryTreeNode node = root;
//
//        while(true){
//            while(node != null){
//                stack.push(node);
//                node = node.getLeft();
//            }
//
//            if(stack.empty())
//                break;
//
//            if(stack.peek() == alpha) {
//                print(stack);
//                return;
//            }
//
//
//            node = stack.peek().getRight();
//        }
//    }
//
//    public static void print(Stack<BinaryTreeNode> stack){
//        StringBuilder sb = new StringBuilder();
//
//        while(!stack.empty()){
//            sb.append(stack.pop().getData() + " ");
//        }
//
//        System.out.println(sb.toString());
//    }

    public static String printPathRec(BinaryTreeNode root, BinaryTreeNode node){
        if(root == null) return null;

        if(root == node)
            return String.valueOf(node.getData());

        String left = printPathRec(root.getLeft() , node);

        if(left != null)
            return root.getData() + "\t"+ left ;

        String right = printPathRec(root.getRight() , node);

        if(right != null)
            return root.getData() + "\t"+ right ;

        return null;
    }

}
