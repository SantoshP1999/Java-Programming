import java.util.*;
class QueueDemo{
    public static void main(String[]args){
        Queue<Integer> Q=new LinkedList<Integer>();

        //offer()
        Q.offer(10);
        Q.offer(20);
        Q.offer(30);
        Q.offer(40);
        Q.offer(50);

        System.out.println(Q);

        System.out.println(Q.peek());
        System.out.println(Q);

         System.out.println(Q.poll());
         System.out.println(Q);

        System.out.println(Q.remove());
        System.out.println(Q);


    }
}