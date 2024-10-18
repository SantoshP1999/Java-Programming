//PriorityBlockingQueue

import java.util.concurrent.*;
class BlockingQueueDemo{
    public static void main(String[] args)throws InterruptedException {
        BlockingQueue bq=new PriorityBlockingQueue<>();

        bq.put("Kanha");
        bq.put("Ashish");
        bq.put("Rahul");

        System.out.println(bq);         //[Ashish, Kanha, Rahul]

        bq.offer("Badhe",3,TimeUnit.SECONDS);
        System.out.println(bq);         //[Ashish, Badhe, Rahul, Kanha]
    }
}