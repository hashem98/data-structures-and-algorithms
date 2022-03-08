/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    private LinkedList<Integer> testList;
    private LinkedList<Integer> testList1;
    private LinkedList<Integer> testList2;
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    public void testInsert(){
        testList = new LinkedList<>();
        testList.insert(5);
       assertNotNull(testList);

    }
    @Test
    public void testIsIncludedFalse(){
        testList = new LinkedList<>();
        testList.insert(5);
        assertEquals(false, testList.include(50));
    }

    @Test
    public void testIsIncludedTrue(){
        testList = new LinkedList<>();
        testList.insert(5);
        testList.insert(6);
        assertTrue(testList.include(6));
    }
    @Test
    public void testToString(){
        testList = new LinkedList<>();
        testList.insert(5);
        testList.insert(6);
        assertEquals("{6} -> {5} -> Null", testList.toString());
    }
    @Test
    public void testInsertBefore(){
        testList = new LinkedList<>();
        testList.Append(5);
        testList.Append(6);
        testList.Append(9);
        testList.insertBefore(6, 13);
        testList.insertBefore(5, 16);
        assertEquals("{16} -> {5} -> {13} -> {6} -> {9} -> Null", testList.toString());
    }
    @Test
    public void testInsertAfter(){
        testList = new LinkedList<>();
        testList.Append(5);
        testList.Append(6);
        testList.Append(9);
        testList.insertAfter(6, 13);

        assertEquals("{5} -> {6} -> {13} -> {9} -> Null", testList.toString());
    }
    @Test
    public void  addNodeToTheEnd(){

        testList2 = new LinkedList<>();
        testList2.insert(55);
        testList2.Append(33);
        String output=testList2.toString();
        String expected="{55} -> {33} -> Null";
        assertEquals(expected,output);
    }
    @Test
    public void testKFromTheEnd() {
        LinkedList<String> testList = new LinkedList<>();
        // Should return 'null' if called on empty list.
        assertNull(null, testList.kthFromEnd(0));
        testList.Append("1");
        //Should return first and only value '1' if k is '0'
        assertEquals("1", testList.kthFromEnd(0));
        // Should return 'null' if k > than the list length.
        assertNull(null, testList.kthFromEnd(2));
        testList.Append("2");
        testList.Append("3");
        testList.Append("4");
        testList.Append("5");
        // testList is now: {1, 2, 3, 4, 5}
        //Confirm '1' is at the head of list
        assertEquals("1", testList.getHeadValue());
        //Confirm '5' is at the tail of list
        assertEquals("5", testList.getLastValue());
        //Should return '5' when k is 0
        assertEquals("5", testList.kthFromEnd(0));
        //Should return '4' when k is 1
        assertEquals("4", testList.kthFromEnd(1));
        //Should return '3' when k is 2
        assertEquals("3", testList.kthFromEnd(2));
        //Should return '2' when k is 3
        assertEquals("2", testList.kthFromEnd(3));
        //Should return '1' when k is 4
        assertEquals("1", testList.kthFromEnd(4));
        //Should return 'null' when k is > 4
        assertNull(null, testList.kthFromEnd(5));
        //Should return 'null' when k is > 4
        assertNull(null, testList.kthFromEnd(100));
        //Should also return null if given negative k
        assertNull(null, testList.kthFromEnd(-1));
    }


}
