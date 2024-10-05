//static methods are called by using class names

//sleep() in Thread.sleep() is a static method


class Demo{
    public static void main(String[]args)throws InterruptedException{
        for(int i=0;i<5;i++){
            System.out.println("In Loop");
            Thread.sleep(2000);
        }
    }
}