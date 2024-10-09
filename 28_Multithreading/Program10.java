class MyThread extends Thread{
    public void run(){
        Thread t=Thread.currentThread();
        System.out.println(t.getName());
    }
}

class ThreadDemo{
    public static void main(String[]args){
        Thread t=Thread.currentThread();
        System.out.println(t.getName());
        
        MyThread obj1=new MyThread();
        obj1.start();

        obj1.start();       //......> ekda start kelela Thread parat start krta yet nahi nahitr IllegalThreadStateException yeto   
    }
}


/*
Output:
    main
    Thread-0
    Exception in thread "main" java.lang.IllegalThreadStateException
*/