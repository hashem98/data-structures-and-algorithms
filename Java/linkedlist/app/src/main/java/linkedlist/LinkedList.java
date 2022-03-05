package linkedlist;

public class LinkedList<T> {
    Node<T> head;

    public LinkedList() {
        this.head=null;
    }
    /**
     * This function insert a new node at the front of the linked list
     * @param value
     */
    public void insert(T value){
        Node<T> newNode = new Node<>(value);
        if(head == null){
            head = newNode;
        }else{
            Node<T> tempRef = head;
            head = newNode;
            newNode.next = tempRef;
        }
    }
    /**
     * Function to check if value is included or not
     * @param value
     * @return true, false
     */
    public boolean include(T value){
//
        if(head == null){
            return false;
        }

        Node<T> tempRef = head;

        while (tempRef != null) {

            if (tempRef.value == value) {
                return true;
            }
            tempRef = tempRef.next;
        }
        return false;
    }
    /**
     * This fucntion for printing out the data in the list
     * @return text
     */

    public String toString(){

        if(head == null){
            return "Your List Empty";
        }

        Node<T> tempRef = head;
        String result="";
        while(tempRef != null){

            result = result + "{" + tempRef.value + "} -> ";

            tempRef = tempRef.next;
        }
        return result +  "Null";
    }
    public void Append(T value) {

        Node<T> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> tempRef = head;
            while(tempRef.next != null){
                tempRef = tempRef.next;
            }
            tempRef.next = newNode;
        }

    }
    public String insertBefore(T existNum, T newValue){

        boolean trueFalse = this.include(existNum);
        if(!trueFalse){
            return "Number doesn't exist";
        }
        Node<T> node = new Node<>(newValue);
        Node<T> tempRefForFirstValue;
        if(head.value == existNum){
            tempRefForFirstValue = head;
            head = node;
            head.next = tempRefForFirstValue;
        }

        Node<T> tempRef = head;
        Node<T> tempRef2 = tempRef;
        while (tempRef.value != existNum){
            tempRef2 = tempRef;
            tempRef = tempRef.next;
        }

        tempRef2.next = node;
        node.next = tempRef;

        return "Number Added";
    }
    public void insertAfter(T value, T newVal) {

        Node curr = head;
        Node newNode = new Node(value);
        newNode.value = newVal;

        while (curr != null && curr.value != value) {
            curr = curr.next;
        }
        if (curr != null) {
            newNode.next = curr.next;
            curr.next = newNode;
        }

    }

    }





