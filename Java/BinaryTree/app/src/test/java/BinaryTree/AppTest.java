/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package BinaryTree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    public void testEmptyTree(){
        BinaryTree binaryTree = new BinaryTree();

        assertNull(binaryTree.getRoot());
    }




    @Test
    public void testTreeWith0neNode(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new Node(1));

        assertEquals(1,binaryTree.getRoot().getKey());

    }

    @Test
    public void testRootAndLeftAndRight(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new Node(1));
        binaryTree.getRoot().setLeft(new Node(2));
        binaryTree.getRoot().setRight(new Node(3));

        assertEquals(2,binaryTree.getRoot().getLeft().getKey());
        assertEquals(3,binaryTree.getRoot().getRight().getKey());
    }

    @Test
    public void testPreorderTraversal(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new Node(5));
        binaryTree.getRoot().setLeft(new Node(10));
        binaryTree.getRoot().setRight(new Node(15));
        binaryTree.getRoot().getLeft().setLeft(new Node(20));

        binaryTree.preOrderTravers(binaryTree.getRoot());

        assertEquals("[5, 10, 15, 20]","[5, 10, 15, 20]","should return [5, 10, 15, 20]" + binaryTree.getPreOrder());
    }

    @Test
    public void testInorderTraversal(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new Node(10));
        binaryTree.getRoot().setLeft(new Node(20));
        binaryTree.getRoot().setRight(new Node(30));
        binaryTree.getRoot().getLeft().setLeft(new Node(40));

        binaryTree.inOrderTravers(binaryTree.getRoot());

        assertEquals("[40, 20, 10, 30]","[40, 20, 10, 30]","should return [40, 22, 10, 30]" + binaryTree.getInOrder());
    }

    @Test
    public void testPostorderTraversal(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new Node(10));
        binaryTree.getRoot().setLeft(new Node(20));
        binaryTree.getRoot().setRight(new Node(30));
        binaryTree.getRoot().getLeft().setLeft(new Node(40));

        binaryTree.postOrderTravers(binaryTree.getRoot());

        assertEquals("[40, 20, 30, 10]","[40, 20, 30, 10]","should return [40, 20, 30, 10]" + binaryTree.getPostOrder());
    }
    @Test
    public void testMaximumValueBinaryTree(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new Node(10));
        binaryTree.getRoot().setLeft(new Node(6));
        binaryTree.getRoot().setRight(new Node(-4));
        binaryTree.getRoot().getLeft().setLeft(new Node(20));

        assertEquals( 20, binaryTree.getMaxValue());
    }

}
