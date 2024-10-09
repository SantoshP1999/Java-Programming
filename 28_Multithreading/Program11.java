//sleep()

class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread());
    }
}

class ThreadDemo{
    public static void main(String[]args)throws InterruptedException{
        MyThread obj=new MyThread();
        System.out.println(Thread.currentThread());
        obj.start();
        Thread.sleep(3000);

        Thread.currentThread().setName("Santosh");
        System.out.println(Thread.currentThread());

    }
}