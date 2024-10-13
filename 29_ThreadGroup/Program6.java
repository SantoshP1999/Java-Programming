class MyThread extends Thread{
    MyThread(ThreadGroup tg,String str){
        super(tg,str);
    }

    public void run(){
        System.out.println(Thread.currentThread());
    }
}

class ThreadGroupDemo{
    public static void main(String[]args){
        ThreadGroup pthreadGP=new ThreadGroup("India");
        MyThread obj1=new MyThread(pthreadGP,"Maharashtra");
        MyThread obj2=new MyThread(pthreadGP,"Goa");
        MyThread obj3=new MyThread(pthreadGP,"Punjab");

        obj1.start();
        obj2.start();
        obj3.start();

        ThreadGroup cthreadGP=new ThreadGroup(pthreadGP,"Pakistan");
        MyThread obj4=new MyThread(cthreadGP,"Lahore");
        MyThread obj5=new MyThread(cthreadGP,"Karachi");
       
        obj4.start();
        obj5.start();

        System.out.println(pthreadGP.activeCount());
        System.out.println(pthreadGP.activeGroupCount());


    }
}