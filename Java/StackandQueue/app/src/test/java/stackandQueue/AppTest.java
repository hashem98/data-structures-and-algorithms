/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stackandQueue;

import org.junit.jupiter.api.Test;
import stackandQueue.AnimalShelter.AnimalShelter;
import stackandQueue.AnimalShelter.Cat;
import stackandQueue.AnimalShelter.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    private Queue<Integer> queue;
    private Stack<Integer> stack;
    private PseudoQueue<Integer> pq;



    // Stack Tests


    @Test void testStackPush() {
        stack = new Stack<Integer>();
        stack.push(5);
        assertEquals("Top -> {5} -> Null", stack.toString());
        assertEquals(1, stack.getSize());
        stack.push(6);
        stack.push(7);
        stack.push(8);
        assertEquals("Top -> {8} -> {7} -> {6} -> {5} -> Null", stack.toString());
        assertEquals(4, stack.getSize());
    }

    @Test void testStackPop() {
        stack = new Stack<Integer>();
        stack.push(5);
        stack.push(6);
        stack.push(7);

        assertEquals(7, stack.pop());
        assertEquals(2, stack.getSize());


        assertEquals(6, stack.pop());
        assertEquals(1, stack.getSize());

        assertEquals(5, stack.pop());
        assertEquals(0, stack.getSize());
    }

    @Test void testStackPeek() throws Exception {
        stack = new Stack<Integer>();
        stack.push(5);
        stack.push(6);
        assertEquals(6, stack.peek());
    }

    //Queue Tests

    @Test void testQueueEnqueue() {
        queue = new Queue<>();
        queue.enqueue(1);
        assertEquals("Front <- {1} back -> Null", queue.toString());
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals("Front <- {1} <- {2} <- {3} back -> Null", queue.toString());

    }

    @Test void testQueueDequeue() throws Exception {
        queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.dequeue());
        queue.enqueue(3);
        assertEquals("Front <- {2} <- {3} back -> Null", queue.toString());
    }

    @Test void testQueuePeek() throws Exception {
        queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.peek());

        // isEmpty Test
        assertEquals(false, queue.isEmpty());
        queue.dequeue();
        queue.dequeue();
        assertEquals(true, queue.isEmpty());
    }
    /**
     * Testing PseudoQueue
     */
    @Test void testEnqueue(){
        pq = new PseudoQueue<Integer>();
        pq.enqueue(1);
        pq.enqueue(2);
        pq.enqueue(3);
        assertEquals("Top -> {1} -> {2} -> {3} -> Null", pq.toString());
    }

    @Test void testDequeue(){
        pq = new PseudoQueue<Integer>();
        pq.enqueue(1);
        pq.enqueue(2);
        pq.enqueue(3);
        pq.dequeue();
        assertEquals("Top -> {2} -> {3} -> Null", pq.toString());
        pq.dequeue();
        pq.dequeue();
        assertEquals("Your List Is Empty", pq.toString());
    }
    /**
     * AnimalShelter
     */
    @Test
    public void test1() throws Exception {
        Dog testDog = new Dog("doggy");
        Queue<Dog> testDogQ = new Queue<>();
        testDogQ.enqueue(testDog);
        String expected="doggy";

        assertEquals(expected,testDogQ.dequeue().getName());
    }


    @Test
    public void test2() throws Exception {
        Dog dog1 = new Dog("dog");
        Cat cat1 = new Cat("cat");
        AnimalShelter Shelter = new AnimalShelter();
        Shelter.enqueue(dog1);
        Shelter.enqueue(cat1);
        Shelter.dequeue("tiger");
        Throwable exception = assertThrows(NoSuchElementException.class, () -> {
            throw new NoSuchElementException("This shelter Just For dogs and cats");
        });
        assertEquals("This shelter Just For dogs and cats", exception.getMessage());

    }

   @Test
    public void dequeue() throws Exception {

        Dog dog1 = new Dog("dog11111");
        Cat cat1 = new Cat("cat11111");
        Dog dog2 = new Dog("dog2");
        Cat cat2 = new Cat("cat2");
        Dog dog3 = new Dog("dog3");
        Cat cat3 = new Cat("cat3");
        AnimalShelter Shelter = new AnimalShelter();
        Shelter.enqueue(dog1);
        Shelter.enqueue(cat1);
        Shelter.enqueue(dog2);
        Shelter.enqueue(cat2);
        Shelter.enqueue(dog3);
        Shelter.enqueue(cat3);
       String expectedcat="cat11111";
       String expecteddog="dog11111";

       assertEquals(expectedcat,Shelter.dequeue("cat").getName());
       assertEquals(expecteddog,Shelter.dequeue("dog").getName());


    }
    // for challenge13
    @Test
    public void balanced(){
   Stack<String> bracket=new Stack<>();
   assertTrue(bracket.balancedParenthensies("({[hashem]})"));

    }
    @Test
    public void notBalanced(){
        Stack<String> bracket=new Stack<>();
        assertFalse(bracket.balancedParenthensies("({[hashem]}))"));

    }
    @Test
    public void ifStringIsEmpty(){
        Stack<String> bracket=new Stack<>();
        assertFalse(bracket.balancedParenthensies("") );

    }
    @Test
    public void duckDuckGoose() throws Exception {

        List<String> people = new ArrayList<>();
        people.add("A");
        people.add("B");
        people.add("C");
        people.add("D");
        people.add("E");
        Queue<String> queue =new Queue<>();
        assertEquals("D",queue.duckDuckGoose(people,3));


    }


}
