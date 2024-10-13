class MyThread implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread());
        try{
            Thread.sleep(3000);
        }catch(InterruptedException ie){

        }
    }
}

class ThreadGroupDemo{
    public static void main(String[]args)throws InterruptedException{
        ThreadGroup pthreadGP=new ThreadGroup("India");

        MyThread obj1=new MyThread();
        MyThread obj2=new MyThread();

        Thread t1=new Thread(pthreadGP,obj1,"Maharashtra");
        Thread t2=new Thread(pthreadGP,obj2,"Goa");

        t1.start();
        t2.start();

        ThreadGroup cthreadGP=new ThreadGroup(pthreadGP,"Pakistan");
        MyThread obj3=new MyThread();
        MyThread obj4=new MyThread();

        Thread t3=new Thread(cthreadGP,obj3,"Lahore");
        Thread t4=new Thread(cthreadGP,obj4,"Karachi");

        t3.start();
        t4.start();

        System.out.println(pthreadGP.activeCount());
        System.out.println(pthreadGP.activeGroupCount());
    }
}