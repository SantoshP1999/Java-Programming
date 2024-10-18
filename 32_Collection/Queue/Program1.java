import java.util.*;
class QueueDemo{
    public static void main(String[]args){
        Queue q=new LinkedList();
        q.offer(10);
        q.offer(20);
        q.offer(50);
        q.offer(30);
        q.offer(40);

        System.out.println(q);      //[10, 20, 50, 30, 40]

        //poll()
        q.poll();
        System.out.println(q);      //[20, 50, 30, 40]

        q.remove();
        System.out.println(q);      //[50, 30, 40]

        //peek()
        System.out.println(q.peek());       //50

        //element()
        System.out.println(q.element());    //50

        System.out.println(q);          //[50, 30, 40]

        
    }
}