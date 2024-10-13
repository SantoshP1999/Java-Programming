class MyThread extends Thread{
    MyThread(ThreadGroup tg,String str){
        super(tg,str);
    }

    public void run(){
        System.out.println(Thread.currentThread());
        try{
            Thread.sleep(2000);
        }catch(InterruptedException ie){
            System.out.println(ie.toString());
        }
    }
}

class ThreadGroupDemo{
    public static void main(String[]args){
        
        ThreadGroup pthreadGP=new ThreadGroup("India");
        MyThread t1=new MyThread(pthreadGP,"Maharashtra");
        MyThread t2=new MyThread(pthreadGP,"Goa");

        t1.start();
        t2.start();

        ThreadGroup cthreadGP = new ThreadGroup(pthreadGP,"Pakistan");
        MyThread t3=new MyThread(pthreadGP,"Lahore");
        MyThread t4=new MyThread(pthreadGP,"Karachi");

        t3.start();
        t4.start();

        ThreadGroup cthreadGP2 = new ThreadGroup(pthreadGP,"Bangladesh");
        MyThread t5=new MyThread(pthreadGP,"Dhaka");
        MyThread t6=new MyThread(pthreadGP,"Mirpur");

        t5.start();
        t6.start();

        cthreadGP.interrupt();
        //cthreadGP2.interrupt();


        System.out.println(pthreadGP.activeCount());
        System.out.println(pthreadGP.activeGroupCount());

     
    }
}