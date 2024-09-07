class Demo{
    Demo(){
        System.out.println("In Constructor Demo");
    }
}

class DemoChild extends Demo{
    DemoChild(){
        System.out.println("In Constructor DemoChild");
    }
}

class Parent{
    Parent(){
        System.out.println("In Constructor Parent");
    }
    void  m1(){
        System.out.println("In m1-Parent");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("In Child Constructor");
    }
    void  m1(){
        System.out.println("In m1-Child");
    }
}

class Client{
    public static void main(String[]args){
        Parent p=new Child();
        p.m1();
    }
}