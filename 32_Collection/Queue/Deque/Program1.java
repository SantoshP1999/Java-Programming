import java.util.*;
class DequeDemo{
    public static void main(String[]args){
        Deque obj=new LinkedList();
        obj.offer(10);
        obj.offer(40);
        obj.offer(20);
        obj.offer(30);

        System.out.println(obj);        //[10, 40, 20, 30]

        //offerFirst()
        obj.offerFirst(5);
        System.out.println(obj);        //[5, 10, 40, 20, 30]
        
        //offerLast()
        obj.offerLast(60);
        System.out.println(obj);        //[5, 10, 40, 20, 30, 60]

        //pollFirst()
        obj.pollFirst();
        System.out.println(obj);        //[10, 40, 20, 30, 60]
        //pollLast()
        obj.pollLast();
        System.out.println(obj);        //[10, 40, 20, 30]

        //peekFirst()
        obj.peekFirst();
        System.out.println(obj);        //[10, 40, 20, 30]

        //peekLast()
        obj.peekLast();
        System.out.println(obj);        //[10, 40, 20, 30]

        //iterator
        Iterator itr=obj.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //descendingIterator
        Iterator itr2=obj.descendingIterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }






    }
}