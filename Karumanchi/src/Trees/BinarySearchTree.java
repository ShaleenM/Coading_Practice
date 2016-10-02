package Trees;

import Trees.BinaryTreeNode.*;

/**
 * Created by Mathurs on 9/28/16.
 */
public class BinarySearchTree {

    BinaryTreeNode root;

    public BinarySearchTree(){
        root = null;
    }

    public BinaryTreeNode getRoot(){
        return this.root;
    }

    public void insert(int val){

        if(root == null) {
            root = new BinaryTreeNode(val);
            return;
        }

        BinaryTreeNode node = root;
        while(true) {
            if (node.getData() >= val) {
                if (node.getLeft() == null) {
                    node.setLeft(new BinaryTreeNode(val));
                    break;
                } else {
                    node = node.getLeft();
                }
            } else if (node.getData() < val) {
                if (node.getRight() == null) {
                    node.setRight(new BinaryTreeNode(val));
                    break;
                } else
                    node = node.getRight();
            }
        }
    }

    public BinaryTreeNode search(int val){

        BinaryTreeNode node = root;
        while(true){
            if(node == null)
                break;

            if(node.getData() == val)
                return node;
            else if(node.getData() >= val)
                node = node.getLeft();
            else
                node = node.getRight();
        }

        return null;
    }

    public int max(){
        if(root == null)
            return Integer.MIN_VALUE;

        BinaryTreeNode node = root;
        while(node.getRight() != null){
            node = node.getRight();
        }
        return node.getData();
    }

    public int min(){
        if(root == null)
            return Integer.MAX_VALUE;

        BinaryTreeNode node = root;
        while(node.getLeft() != null){
            node = node.getLeft();
        }

        return node.getData();
    }

    public void delete(BinaryTreeNode root , int val){

        if(root == null){
            return;
        }
        BinaryTreeNode temp;

        if(root.getData() > val)
            delete(root.getLeft() , val);
        else if(root.getData() < val)
            delete(root.getRight() , val);
        else{   // Found node

            if(root.getLeft() != null && root.getRight() != null){
                // Two Children
                temp = inOrderPred(root);
                root.setData(temp.getData());
                delete(temp, val);
            }
            else if(root.getLeft() != null || root.getRight() != null ){
                // One Child
                if(root.getLeft() != null){
                    root.setData(root.getLeft().getData());
                    root.setLeft(null);
                }
                else if(root.getRight() != null){
                    root.setData(root.getRight().getData());
                    root.setRight(null);
                }
            }
            else{   //No Child
                temp = getParent(this.root , root);
                temp.setLeft(null);
                temp.setRight(null);
            }

        }

    }

    public BinaryTreeNode inOrderPred(BinaryTreeNode root){

        root = root.getLeft();
        while(root.getRight() != null)
            root = root.getRight();

        return root;
    }

    public BinaryTreeNode inOrderSuc(BinaryTreeNode root){
        root = root.getRight();
        while(root.getLeft() != null)
            root = root.getLeft();

        return root;
    }

    public BinaryTreeNode getParent(BinaryTreeNode root , BinaryTreeNode node){

        BinaryTreeNode parent = null;
        while(true){
            if(root == null)
                break;

            if(root == node)
                return parent;
            else if(root.getData() >= node.getData()) {
                parent = root;
                root = root.getLeft();
            }
            else {
                parent = root;
                root = root.getRight();
            }
        }

        return null;

    }

}
