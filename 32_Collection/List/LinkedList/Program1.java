import java.util.*;
class LinkedListDemo{
    public static void main(String[]args){
        LinkedList ll=new LinkedList();
        ll.add(20);
        System.out.println(ll);                         //[20]

        //addFirst()
        ll.addFirst(10);
        System.out.println(ll);                         //[10, 20]

        //addLast
        ll.addLast(30);
        System.out.println(ll);                         //[10, 20, 30]

        //getFirst()
        ll.getFirst();
        System.out.println(ll);                         //[10, 20, 30]

        //getLast()
        ll.getLast();
        System.out.println(ll);                         //[10, 20, 30]

        //removeFirst()
        ll.removeFirst();
        System.out.println(ll);                         //[20, 30]

        //removeLast()
        ll.removeLast();
        System.out.println(ll);                         //[20]

    }
}