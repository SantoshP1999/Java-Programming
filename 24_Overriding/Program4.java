//Access specifire in overriding
class Parent{
    public void fun(){                          //access specifier:public
        System.out.println("Parent fun");
    }
}

class Child extends Parent{
   void fun(){     //public void fun();                            //access specifier:default
        System.out.println("Child fun");
    }
}

class Client{
    public static void main(String[]args){
        Parent p=new Child();
        p.fun();
    }
}

//error : ===> attempting to assign weaker access privileges; was public