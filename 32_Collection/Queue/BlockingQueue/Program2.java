//ArrayBlockingQueue

import java.util.ArrayList;
import java.util.concurrent.*;
class BlockingQueueDemo{
    public static void main(String[]args)throws InterruptedException{
        BlockingQueue bq=new ArrayBlockingQueue(3);
        bq.offer(10);
        bq.offer(20);
        bq.offer(30);

        System.out.println(bq);         //[10, 20, 30]

        bq.offer(40,5, TimeUnit.SECONDS);
        System.out.println(bq);                 //[10, 20, 30]
        
        bq.take();
        System.out.println(bq);                 //[20,30]


        //drainTo()

        ArrayList al=new ArrayList<>();
        System.out.println("ArrayList "+al);        //ArrayList[]
        bq.drainTo(al);
        System.out.println("ArrayList"+al);         //ArrayList[29, 30]
        System.out.println(bq);                      //[]
    }
}