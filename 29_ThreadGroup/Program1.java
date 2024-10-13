//ThreadGroup

class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getThreadGroup());
    }
}

class ThreadGroupDemo{
    public static void main(String[]args){
    MyThread obj=new MyThread();
    obj.start();
        System.out.println(Thread.currentThread().getThreadGroup());

    }
}


/*
    Output:

    java.lang.ThreadGroup[name=main,maxpri=10]
    java.lang.ThreadGroup[name=main,maxpri=10]
    
*/