package BinaryTree;

public class BinarySearchTree extends BinaryTree {

    Node root;

    public void add(int key){
        if(root == null){
            root = new Node(key );
        } else{
            Node curr = root;
            traverseAdd(curr, key);
        }
    }

    public boolean contain(int key){
        Node curr = root;
        return traverseContain(curr, key) != null;
    }

    public void traverseAdd(Node curr, int key){
        if(key > curr.getKey()){
            if(curr.getRight() == null){
                curr.setRight(new Node(key));
                return;
            }

            curr = curr.getRight();
        }else{
            if(curr.getLeft() == null){
                curr.setLeft(new Node(key));
                return;
            }

            curr = curr.getLeft();
        }
        traverseAdd(curr, key);
    }

    public Node traverseContain(Node curr, int key){
        if(curr == null || curr.getKey() == key){
            return curr;
        }

        if(curr.getKey() > key){
            return traverseContain(curr.getLeft(), key);
        }

        return traverseContain(curr.getRight(), key);
    }
}