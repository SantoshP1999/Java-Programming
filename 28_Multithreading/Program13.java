//join()

class MyThread extends Thread{
    static Thread nmMain=null;
    public void run(){
        try{
            nmMain.join(1000);      //nmMain.join()..>If join() is blank then deadlock condition occurs
        }catch(InterruptedException ie){

        } 
        for(int i=1;i<5;i++){
            System.out.println("In Thread-0");
            }
    }
}

class ThreadDemo{
    public static void main(String[]args)throws InterruptedException{
        MyThread.nmMain=Thread.currentThread();
        MyThread obj=new MyThread();
        obj.start();
        obj.join();
        for(int i=1;i<5;i++){
            System.out.println("In main");
        }
    }
}

/*

    NOTE:-Do not use blank join while using join()method
        -Set timer to the join ......>join(2000);
        -If join() is blank then deadlock condition occurs
 
 */