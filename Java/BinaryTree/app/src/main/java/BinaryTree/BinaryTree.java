package BinaryTree;

import BinaryTree.Queue.Queue;

import java.util.ArrayList;

public class BinaryTree <T> extends BinarySearchTree {

    private Node root;

    public ArrayList<T> preOrder = new ArrayList<>();
    public ArrayList<T> inOrder = new ArrayList<>();
    public ArrayList<T> postOrder = new ArrayList<>();
    private int max = 0;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    public ArrayList<T> getPreOrder() {
        return preOrder;
    }

    public ArrayList<T> getInOrder() {
        return inOrder;
    }

    public ArrayList<T> getPostOrder() {
        return postOrder;
    }

    public void inOrderTravers(Node node){
        if (root == null) {
            System.out.println("Tree is Empty!");
            return;
        }

        if(node != null){
            inOrderTravers(node.getLeft());
            System.out.print(" " + node.getKey());
            inOrder.add((T) node.getKey());
            inOrderTravers(node.getRight());
        }
    }


    public void postOrderTravers(Node node){
        if (root == null) {
            System.out.println("Tree is Empty!");
            return;
        }

        if(node != null){
            postOrderTravers(node.getLeft());
            postOrderTravers(node.getRight());
            System.out.print(" " + node.getKey());
            postOrder.add((T) node.getKey());
        }
    }

    public void preOrderTravers(Node node) {
        if (root == null) {
            System.out.println("Tree is Empty!");
            return;
        }

        if (node != null) {
            System.out.print(" " + node.getKey());
            preOrder.add((T) node.getKey());
            preOrderTravers(node.getLeft());
            preOrderTravers(node.getRight());
        }
    }
    public Integer getMaxValue(){
        if (root == null) {
            System.out.println("Tree is Empty!");
            return null;
        }
        else {
            findMaxHelper(root);
        }

        return max;
    }

    private void findMaxHelper(Node node){

        if(node != null) {
            if((Integer)node.getKey() > max){
                max = (Integer)node.getKey();
            }
            findMaxHelper(node.getLeft());
            findMaxHelper(node.getRight());
        }
    }
    public ArrayList<Integer> breadthFirst(BinaryTree tree) throws Exception {

        ArrayList<Integer> result = new ArrayList<>();

        // Declare my Queue class to hold tree nodes
        Queue<Node> nodes = new Queue<>();

        if(tree.root != null) {
            nodes.enqueue(tree.root);
        }

        while(nodes.getSize() > 0) {

            Node temp = nodes.dequeue();
            result.add((Integer)temp.getKey());

            if(temp.getLeft() != null) {
                nodes.enqueue(temp.getLeft());
            }
            if(temp.getRight() != null) {
                nodes.enqueue(temp.getRight());
            }
        }
        return result;
    }
    /**
     * interview solution question number 1
     * @param tree
     * @return
     * @throws Exception
     */
    public int sumOfOddNumbers(BinaryTree tree) throws Exception {

        int sum = 0;

        // Declare my Queue class to hold tree nodes
        Queue<Node> nodes = new Queue<>();

        if(tree.root != null) {
            nodes.enqueue(tree.root);
        }

        while(nodes.getSize() > 0) {

            Node temp = nodes.dequeue();

            if((Integer)temp.getKey() % 2 != 0)
                sum = sum + (Integer)temp.getKey();

            if(temp.getLeft() != null) {
                nodes.enqueue(temp.getLeft());
            }
            if(temp.getRight() != null) {
                nodes.enqueue(temp.getRight());
            }
        }
        return sum;
    }


    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }

}
