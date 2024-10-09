//Priority of ThreadsS

class MyThread extends Thread{
    public void run(){
        Thread t=Thread.currentThread();
        System.out.println(t.getPriority());        //t.getName()
    }
}

class ThreadDemo{
    public static void main(String[]args){
        Thread t=Thread.currentThread();
        System.out.println(t.getPriority());        //t.getName()

        MyThread obj1=new MyThread();
        obj1.start();

        t.setPriority(7);                       //if(0<10)......>  IllegalArgumentException

        MyThread obj2=new MyThread();
        obj2.start();
    }
}