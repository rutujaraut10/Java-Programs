import java.util.*;
public class CustomLinkedList {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        System.out.println("Initial size of linked list: " + l1.size());

        l1.add("Pune");
        l1.add("Mumbai");
        l1.add("Delhi");
        l1.add("Noida");
        System.out.println("Element of Linkedlist" + l1);
        System.out.println("Size of Linked list affer addition:" + l1.size());

        l1.remove(2);
        System.out.println("Element of LinkedList after deletion" + l1);
        System.out.println("Size of the LinkedList after deletion" + l1.size());

        l1.removeFirst();
        l1.removeLast();
        System.out.println("l1 after deleting first and last" + l1);;
        System.out.println("Size of the linkedlist after deletion" + l1.size());

        System.out.println("Fisrt element of Linkedlist:" +l1.getFirst());
        System.out.println("Last element of linkedlist" +l1.getLast());

        Iterator<String> itr = l1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next()+",");
        }
    }
}
