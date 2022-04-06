package BinaryTree;

public class BinarySearchTree <T extends Comparable> {

    Node root;

    public void add(T value) {
        root = addNode(root, value);
    }


    public Node addNode(Node node, T value) {
        try {
            if (node == null) {
                return new Node(value);
            } else if (value.compareTo(node.getKey()) >0 ) {
                node.right = addNode(node.right, value);

            } else if (value.compareTo(node.key) <= 0) {
                node.left = addNode(node.left, value);

            } else {

                return node;
            }
            return node;
        }catch (IllegalStateException ex){
            throw new IllegalStateException("error");
        }
    }


    public boolean contain(int key){
        Node curr = root;
        return traverseContain(curr, key) != null;
    }


    public Node traverseContain(Node curr, int key){
        if(curr == null || (Integer)curr.getKey() == key){
            return curr;
        }

        if((Integer)curr.getKey() > key){
            return traverseContain(curr.getLeft(), key);
        }

        return traverseContain(curr.getRight(), key);
    }
    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }

}