package stackandQueue;

import java.util.List;

public class Queue<T> {
    private Node<T> front;
    private Node<T> back;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void enqueue(T value) {
        Node<T> node = new Node<>(value);
        if (isEmpty()) {
            front = node;
        } else {
            back.next = node;
        }
        back = node;
        size++;
    }

    public T dequeue() throws Exception {
        if (front == null) {
            throw new Exception("Your Queue Is Empty!");
        }
        Node<T> tempRef = front;
        front = front.next;
        tempRef.next = null;
        size--;
        return tempRef.value;

    }

    public T peek() throws Exception {
        if (front == null) {
            throw new Exception("Your Queue Is Empty!");
        }

        return front.value;
    }

    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public String toString() {
        if (front == null) {
            return "Your queue Is Empty";
        }

        Node<T> tempRef = front;
        String print = "Front <- ";
        while (tempRef.next != null) {
            print = print + "{" + tempRef.value + "} <- ";
            tempRef = tempRef.next;
        }
        print += "{" + tempRef.value + "} back -> Null";
        return print;
    }

    /**
     * This Function for interview
     *
     * @param people
     * @param k
     * @return
     */

    public String duckDuckGoose(List<String> people, int k) throws Exception {
        Queue<String> names = new Queue<>();
        int counter = 0;
        while (counter < people.size()) {
            names.enqueue(people.get(counter));
            counter++;
        }
        int kCount = 1;
        while (names.size != 1){
            if (kCount != k){
                names.enqueue(names.dequeue());
            }else {
                names.dequeue();
                kCount = 0;
            }
            kCount++;
        }
        return names.dequeue();
    }

}
