// yield()

class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
class ThreadYieldDemo{
    public static void main(String[]args){
        MyThread obj=new MyThread();
        obj.start();
        obj.yield();
        System.out.println(Thread.currentThread().getName());

    }
}

/**
 
 NOTE:
        -yield() fkt barobarichya Threads la krta yete or jast priority aahe tyanach krta yete
        -Low priority chya Threads la yield() krta yet nahi
        -yield() ha fkt eka time quantum sathi thambto

 */