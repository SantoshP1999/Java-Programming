interface Demo1{
    static void fun(){
        System.out.println("In Demo1-fun");

    }
}

interface Demo2{
    static void fun(){
        System.out.println("In Demo2-fun");
    }
}

class DemoChild implements Demo1,Demo2{
    void fun(){
        System.out.println("In DemoChild-fun");
            Demo1.fun();
            Demo2.fun();

        
    }
}

class Client{
    public static void main(String[]args){
        DemoChild obj=new DemoChild();
        obj.fun();
    }
}