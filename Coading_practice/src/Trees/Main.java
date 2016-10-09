package Trees;

/**
 * Created by Mathurs on 9/24/16.
 */
public class Main {

    public static void main(String[] args){

        BinaryTreeNode root  = new BinaryTreeNode(1);

        BinaryTreeNode node2  = new BinaryTreeNode(2);
        BinaryTreeNode node3  = new BinaryTreeNode(3);
        BinaryTreeNode node4  = new BinaryTreeNode(4);
        BinaryTreeNode node5  = new BinaryTreeNode(5);
        BinaryTreeNode node6  = new BinaryTreeNode(6);
        BinaryTreeNode node7  = new BinaryTreeNode(7);
        BinaryTreeNode node8  = new BinaryTreeNode(8);
        BinaryTreeNode node9  = new BinaryTreeNode(9);
        BinaryTreeNode node10  = new BinaryTreeNode(10);

        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
//        node3.setRight(node7);
        node5.setLeft(node8);
        node5.setRight(node9);
        node9.setRight(node10);


//        TreeTraversal.preOrderTraversal(root);
//        TreeTraversal.preOrderTraversalItr(root);
//        TreeTraversal.inOrderTraversal(root);
//        TreeTraversal.inOrderTraversalItr(root);
//        TreeTraversal.postOrderTraversalItr(root);
//        TreeTraversal.levelOrderTraversalItr(root);
//        BinaryTreeAlgos.reverseLevelOrderPrint(root);
//        System.out.print(BinaryTreeAlgos.getHeight(root));

//        System.out.println( "Diameter before = " + BinaryTreeAlgos.diameter);
//        BinaryTreeAlgos.findDiameter(root);
//        System.out.println( "Diameter after = " + BinaryTreeAlgos.diameter);
//
//        System.out.println( "Level with Max sum = " + BinaryTreeAlgos.levelWithMaxSum(root));

//        BinaryTreeAlgos.printLeafPaths(root);
//        System.out.println("LCA  = " + BinaryTreeAlgos.LCA(root, node8 , node3).getData());
//        System.out.println("Path of given Node == "+printPathRec(root , node8));

//        BinarySearchTree bTree = new BinarySearchTree();
//        bTree.insert(12);
//        bTree.insert(5);
//        bTree.insert(3);
//        bTree.insert(12);
//        bTree.insert(14);
//        bTree.insert(5);
//        bTree.insert(2);
//        bTree.insert(27);
//        bTree.insert(65);
//        bTree.insert(8);
//        bTree.insert(6);
//        bTree.insert(7);
//        bTree.insert(10);
//        bTree.insert(11);
//
//        root = bTree.getRoot();
//        System.out.println(bTree.search(6235));
//        System.out.println("Min Value of the tree = " + bTree.min());
//        System.out.println("Max Value of the tree = " + bTree.max());
//        System.out.println(bTree.search(10).getData());
//        bTree.delete(bTree.getRoot(), 10);
//        System.out.println(bTree.search(10));
//        System.out.println(bTree.search(65));
//        bTree.delete(bTree.getRoot(), 65);
//        System.out.println(bTree.search(65));


        //Heap
//
//        MaxHeap heap = new MaxHeap(20);
//
//        try {
//
//            heap.insert(1);
//            heap.insert(3);
//            heap.insert(5);
//            heap.insert(7);
//            heap.insert(9);
//            heap.insert(2);
//            heap.insert(32);
//            heap.insert(64);
//            heap.insert(23);
//            heap.insert(98);
//            heap.insert(102);
//            heap.insert(782);
//            heap.insert(45);
//            heap.insert(2);
//
//            System.out.println(heap.deleteMax());
//            System.out.println(heap.deleteMax());
//            System.out.println(heap.deleteMax());
//            System.out.println(heap.deleteMax());
//            System.out.println(heap.deleteMax());
//            System.out.println(heap.deleteMax());
//            System.out.println(heap.deleteMax());
//            System.out.println(heap.deleteMax());
//            System.out.println(heap.deleteMax());
//            System.out.println(heap.deleteMax());
//            System.out.println(heap.deleteMax());
//            System.out.println(heap.deleteMax());
//            System.out.println(heap.deleteMax());
//            System.out.println(heap.deleteMax());
//            System.out.println(heap.deleteMax());
//            System.out.println(heap.deleteMax());
//            System.out.println(heap.deleteMax());
//
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
////
//        int[] array = {1  ,3 , 3 , 3 , 5 ,3 , 6 , 7};
//
//        System.out.println("Sorted Array :: " + Arrays.toString(heapify(array, 0)));
//
//
//        MaxSlidingWindow.maxSlidingWindow1(array, 3);
//        RunningMedianValue.runningMedianValue();

        RightViewOfTree.rightViewOfTree(root);
    }

    public static int[] heapify(int[] array , int root){


        MaxHeap heap = new MaxHeap(array.length);
        for(int i = 0 ; i < array.length ; i++){
            heap.array[i] = array[i];
        }

        heap.size = array.length;

        for(int i = (heap.size-1)/2 ; i >= 0; i--)
            heap.percolateDown(i);

        return heap.array;
    }
}
