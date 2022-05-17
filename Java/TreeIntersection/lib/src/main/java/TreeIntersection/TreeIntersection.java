package TreeIntersection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TreeIntersection {
    private final HashMap<Integer, Integer> hashMap = new HashMap<>();
    private final List<Integer> intersections = new ArrayList<>();

    public List<Integer> treeIntersection(BinaryTree tree1, BinaryTree tree2){
        if (tree1.getRoot() == null || tree2.getRoot() == null) {
            return null;
        }
        traverse(tree1.getRoot());

        compare(tree2.getRoot());

        return intersections;
    }

    private void traverse(Node node) {
        if (node != null) {
            hashMap.put(node.getKey(), 1); // constant value cuz i only need the key to compare

            traverse(node.getLeft());
            traverse(node.getRight());
        }
    }

    private void compare(Node node){
        if (node != null) {
            if (hashMap.get(node.getKey()) != null){
                intersections.add(node.getKey());
            }
            compare(node.getLeft());
            compare(node.getRight());
        }
    }
}
