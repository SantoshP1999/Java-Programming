//InterruptedException in Thread

class ThreadDemo{
    static void fun(){
        for(int i=10;i<20;i++){
            try{
                Thread.sleep(3000);
            }catch(InterruptedException ie){

            }
        }
    }

    public static void main(String args[])throws InterruptedException{
        for(int i=0;i<10;i++){
            System.out.println(i);
            Thread.sleep(2000);
        }
        fun();
    }
}