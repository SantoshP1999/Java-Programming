import java.util.concurrent.*;
class MyThread implements Runnable{
    int num;
    MyThread(int num){

    }

    public void run(){
        System.out.println("Start: "+num+Thread.currentThread());
        dailyTask();
        System.out.println("End: "+num+Thread.currentThread());
    }
    void dailyTask(){
        try{
            Thread.sleep(3000);
        }catch(InterruptedException ie){

        }
    }
}

class ThreadPoolDemo{
    public static void main(String[]args){
        ThreadPoolExecutor tpe1=(ThreadPoolExecutor)Executors.newFixedThreadPool(2);

        ThreadPoolExecutor tpe2=(ThreadPoolExecutor)Executors.newFixedThreadPool(2);

        for(int i=1;i<=4;i++){
            MyThread obj1=new MyThread(i);
            tpe1.execute(obj1);
        }

        for(int i=1;i<=4;i++){
            MyThread obj2=new MyThread(i);
            tpe2.execute(obj2);
        }

        tpe1.shutdown();
        tpe2.shutdown();


    }
}