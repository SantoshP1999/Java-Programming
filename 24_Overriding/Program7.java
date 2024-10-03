//Static modifier in overriding

class Parent{
    static void fun(){
        System.out.println("In Parent fun");
    }
}
class Child extends Parent{
    static void fun(){
        System.out.println("In Child fun");
    }
}

class Client{
    public static void main(String[]args){
        Parent obj=new Parent();        //Parent reference & PArent Child
        obj.fun();                      //In parent fun

        Child obj2=new Child();         //child reference & child object
        obj2.fun();                     //In Child fun

        Parent obj3=new Child();        //parent reference & child object
        obj3.fun();                     //In Parent fun
    }
}