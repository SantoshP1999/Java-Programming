//============1)..@override Annotation=================

class Parent{
    Parent(){
        System.out.println("Parent Constructor");
    }

    void m1(){
        System.out.println("Parent m1");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("Child Constructor");
    }

    @Override

    void m1(int x){
        System.out.println("Child m1");
    }
}

class Client{
    public static void main(String[]args){
        Parent p= new Child();
        p.m1();
    }
}