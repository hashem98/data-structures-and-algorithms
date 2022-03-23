package stackandQueue;

public class Stack <T>{
    Node<T> top;
    int size;

    public int getSize() {
        return size;
    }

    public void push(T value){
        Node<T> n =  new Node<>(value);
        if(top == null){
            top = n;
        }else{
            Node<T> tempRef = top;
            top = n;
            top.next = tempRef;
        }
        size++;
    }


    public T pop(){
        if(top == null){
            return null;
        }

        Node<T> tempRef = top;
        top = top.next;
        tempRef.next = null;
        size--;
        return tempRef.value;
    }

    public T peek() throws Exception {
        if(top == null){
            throw new Exception("Your Stack is Empty");
        }

        return top.value;
    }

    public boolean isEmpty(){
        return top == null;
    }


    public String toString(){
        if(isEmpty()){
            return "Your List Is Empty";
        }

        Node<T> tempRef = top;
        String print = "Top -> ";
        while (tempRef.next != null){
            print = print + "{" + tempRef.value + "} -> ";
            tempRef = tempRef.next;
        }
        print += "{" + tempRef.value + "} -> Null";
        return print;
    }

    /**
     *
     * @param s
     * @return boolean
     * for challenge13
     */
    public  boolean balancedParenthensies(String s) {
        Stack<Character> stack  = new Stack<Character>();
        if (s==""){
            System.out.println("your String has No bracket");
            return false;

        }
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {
                stack.push(c);
            } else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
