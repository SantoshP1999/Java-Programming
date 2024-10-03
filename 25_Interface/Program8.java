interface Demo{
    void gun();
    default void fun(){
        System.out.println("In Demo fun");
    }
}
class DemoChild implements Demo{
    public void gun(){
        System.out.println("In DemoChild gun");
    }
}

class Client{
    public static void main(String[]args){
        Demo obj=new DemoChild();
        obj.fun();
        obj.gun();
    }
}