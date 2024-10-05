//Arithmatic Exception

class Demo{
    void m2(){
        System.out.println("Start m2");
        System.out.println(10/0);
        System.out.println("End m2");

    }

    void m1(){
        System.out.println("Start m1");
        m2();
        System.out.println("End m1");

    }

    public static void main(String[]args){
        System.out.println("In main");
        Demo obj=new Demo();
        obj.m1();
        System.out.println("End main");
    }
}


/*
In main
Start m1
Start m2
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Demo.m2(Program7.java:6)
        at Demo.m1(Program7.java:13)
        at Demo.main(Program7.java:21)
*/