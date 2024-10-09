//Creating Thread by Using Thread Class

class MyThread extends Thread{
    public void run(){
        for(int i=1;i<10;i++){
            System.out.println("In run");
        }
    }
}

class ThreadDemo{
    public static void main(String[]args){
        for(int i=1;i<10;i++){
            MyThread obj=new MyThread();
            obj.start();
            System.out.println("In main");
        }
    }
}