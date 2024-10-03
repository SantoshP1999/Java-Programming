interface Demo1{
    default void fun(){
        System.out.println("In Demo1-fun");
    }
}

interface Demo2{
    default void fun(){
        System.out.println("In Demo2-fun");
    }
}

class DemoChild implements Demo1,Demo2{
    public void fun(){
        System.out.println("In DemoChild-fun");
    }
}

class Client{
    public static void main(String[]args){
        DemoChild obj=new DemoChild();
        obj.fun();

        // Demo1 obj1=new Demo1();
        // obj1.fun();
        
        // Demo2 obj2=new Demo2();
        // obj2.fun();


    }
}