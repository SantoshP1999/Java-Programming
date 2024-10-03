interface Demo{
    static void fun(){
        System.out.println("In Demo-fun");
    }
}

class DemoChild implements Demo{

}

class Client{
    public static void main(String[]args){
        DemoChild obj=new DemoChild();
        
        obj.fun();              //error: cannot find symbol
    }
}

//static in class & interface are diffrent