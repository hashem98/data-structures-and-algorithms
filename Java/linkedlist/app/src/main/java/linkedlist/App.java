/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedlist;

public class App {
    public String getGreeting() {
        return "";
    }
    static final LinkedList<Integer> list1 = new LinkedList<>();
    static final LinkedList<Integer> list2 = new LinkedList<>();
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        list1.insert(5);
        list1.insert(10);
        list1.insert(20);
        list1.insert(25);

        System.out.println("Does your value exist ? " + list1.include(50));
        System.out.println("Does your value exist ? " + list1.include(25));
        System.out.println(list1.toString());


    }
    public static LinkedList zipLists(LinkedList number1 , LinkedList number2){
        LinkedList<Integer> number3 = new LinkedList<Integer>();
        Node current1 = number1.head;
        Node current2 = number2.head;
        while (current1 != null || current2 != null ){
            if (current1 == null){

                number3.Append((Integer) current2.value);
                current2 = current2.next;
                continue;
            }
            if (current2 == null){
                number3.Append((Integer) current1.value);
                current1 =current1.next;
                continue;
            }

            number3.Append((Integer) current1.value);
            number3.Append((Integer) current2.value);
            current1 =current1.next;
            current2 = current2.next;
        }
        return number3;
    }

}
