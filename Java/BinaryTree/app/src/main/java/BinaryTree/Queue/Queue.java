package BinaryTree.Queue;

public class Queue<T> {
    private QueueNode<T> front;
    private QueueNode<T> back;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void enqueue(T value) {
        QueueNode<T> node = new QueueNode<>(value);
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
        QueueNode<T> tempRef = front;
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

        QueueNode<T> tempRef = front;
        String print = "Front <- ";
        while (tempRef.next != null) {
            print = print + "{" + tempRef.value + "} <- ";
            tempRef = tempRef.next;
        }
        print += "{" + tempRef.value + "} back -> Null";
        return print;
    }


}
