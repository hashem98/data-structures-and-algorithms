package BinaryTree;

public class Node<T> {

     final T key;
     Node left;
     Node right;

    public Node(T key) {
        this.key = key;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public T getKey() {
        return key;
    }
    @Override
    public String toString() {
        return "Node{" +
                "value=" + key +
                ", right=" + right +
                ", left=" + left +
                '}';
    }
}