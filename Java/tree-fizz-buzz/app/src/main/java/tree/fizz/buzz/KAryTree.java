package tree.fizz.buzz;

import java.util.ArrayList;
import java.util.List;

public class KAryTree<T> {

    private Node<T> root;
    private int height;
    private int index = 0;
    private final List<Node<T>> KArayTreeNodes = new ArrayList<>();

    public KAryTree(List<T> values, int K){
        int arrayLength = values.size();

        if (arrayLength <= 0) {
            return;
        }
        root = new Node<>(values.get(0),K);
        KArayTreeNodes.add(root);
        createKAryTree(values, K, root);
    }

    private void createKAryTree(List<T> values, int K, Node<T> node){
        for (int j = 0; j < K; j++) {
            if ((K * index + (j + 1)) > (values.size() - 1)){
                return;
            }else {
                KArayTreeNodes.add(node.addChild(values.get(K * index + (j + 1))));
            }
        }
        if (index < values.size()) {
            index++;
            createKAryTree(values, K, KArayTreeNodes.get(index));
        }
    }

    // Function to print postorder traversal of the tree
    public void postorder(Node<T> root) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < root.getChildren().size(); i++) {
            postorder(root.getChildren().get(i));
        }
        System.out.print(root.getKey() + " ");
    }

    public KAryTree<String> treeFizzBuzz(KAryTree<T> tree){
        List<Node<T>> list = new ArrayList<>();
        KAryTree<String> kAryTree = new KAryTree(list, 3);

        for (Node<T> kAryNode: KArayTreeNodes){
            if ((((Integer) kAryNode.getKey()) % 3 == 0) && (((Integer) kAryNode.getKey()) % 5 == 0)){
                kAryTree.getKArayTreeNodes().add(new Node<>("FizzBuzz",3));
            }else if(((Integer) kAryNode.getKey()) % 3 == 0){
                kAryTree.getKArayTreeNodes().add(new Node<>("Fizz",3));
            }else if(((Integer) kAryNode.getKey()) % 5 == 0){
                kAryTree.getKArayTreeNodes().add(new Node<>("Buzz",3));
            }else {
                kAryTree.getKArayTreeNodes().add(new Node<>(kAryNode.getKey().toString(),3));
            }
        }
        return kAryTree;
    }

    public StringBuilder noOrder(KAryTree<T> tree){
        List<Node<T>> list =tree.getKArayTreeNodes();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ ");
        for (Node<T> node : list){
            stringBuilder.append(" "+node.getKey()+" ");
        }
        stringBuilder.append(" }");
        return stringBuilder;
    }


    private List<Node<T>> getKArayTreeNodes() {
        return KArayTreeNodes;
    }

    public Node<T> getRoot() {
        return root;
    }
}