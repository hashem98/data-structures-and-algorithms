package tree.fizz.buzz;


import java.util.ArrayList;
import java.util.List;

public class Node<T> {

    private T key;
    private final int K;
    private List<Node<T>> children = new ArrayList<>();

    public Node(T key, int k) {
        this.key = key;
        this.K = k;
//    children = new ArrayList<>(K);
    }

    public Node<T> addChild(T key) {
        Node<T> newNode = new Node<T>(key, K);
        if (children.size() < K) {
            children.add(newNode);
            return newNode;
        }

        return null;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public Node<T> getChild(int index) {
        if (children.size() > index && index >= 0) {
            return children.get(index);
        }

        return null;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }
}
