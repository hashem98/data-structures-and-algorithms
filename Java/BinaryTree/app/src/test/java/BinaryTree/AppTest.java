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
    public void addRoot() {
        BinarySearchTree test2 = new BinarySearchTree();
        test2.add(5);
        assertNotNull (test2.root);
    }


    @Test
    public void add() {
        BinarySearchTree test3 = new BinarySearchTree();
        test3.add(5);
        test3.add(7);
        test3.add(3);
        test3.add(10);
        String expected="BinarySearchTree{root=Node{value=5, right=Node{value=7, right=Node{value=10, right=null, left=null}, left=null}, left=Node{value=3, right=null, left=null}}}" ;
        assertEquals (expected,test3.toString());
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
    @Test
    public void testMaximumValueBinaryTreeNeg(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new Node(-10));
        binaryTree.getRoot().setLeft(new Node(-6));
        binaryTree.getRoot().setRight(new Node(-4));
        binaryTree.getRoot().getLeft().setLeft(new Node(-20));

        assertEquals( -4, binaryTree.getMaxValue());
    }
    @Test
    public  void  testBreadthFirst() throws Exception {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.setRoot(new Node(1));
        binaryTree.getRoot().setLeft(new Node(2));
        binaryTree.getRoot().setRight(new Node(3));
        binaryTree.getRoot().getRight().setLeft(new Node(7));
        binaryTree.getRoot().getRight().setRight(new Node(8));
        binaryTree.getRoot().getLeft().setLeft(new Node(5));
        binaryTree.getRoot().getLeft().setRight(new Node(6));

        assertEquals("[1, 2, 3, 5, 6, 7, 8]", binaryTree.breadthFirst(binaryTree).toString());
    }
@Test
    public  void testSumOfOdd() throws Exception {



    BinaryTree binaryTree = new BinaryTree();
    BinaryTree binaryTree2 = new BinaryTree();

    binaryTree.setRoot(new Node(1));
       binaryTree.getRoot().setLeft(new Node(2));
       binaryTree.getRoot().setRight(new Node(3));
      binaryTree.getRoot().getLeft().setLeft(new Node(4));
      binaryTree.getRoot().getLeft().setRight(new Node(5));
      assertEquals(binaryTree2.sumOfOddNumbers(binaryTree),9);
}
}


