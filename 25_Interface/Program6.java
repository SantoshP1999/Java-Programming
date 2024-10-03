interface Demo1{
    // static void m1(){               //if we use static access specifire then illegal static interface method call error occurs
    default void m1(){                                //If we want to remove this error then use default keyword
        System.out.println("In Demo1-m1");
    }
}

interface Demo2{
    static void m1(){
        System.out.println("In Demo2-m1");
    }
}

interface Demo3 extends Demo1,Demo2{

}

class Client implements Demo3{
    public static void main(String[]args){
        Demo1 obj=new DemoChild();
        obj.m1();
    }
}
