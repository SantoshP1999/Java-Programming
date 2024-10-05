//Default Exception Handler

class Demo{
    void m2(){
        System.out.println("In m2");
    }

    void m1(){
        System.out.println("In m1");
        System.out.println(10/0);
        m2();
    }

    public static void main(String[]args){
        Demo obj=new Demo();
        obj.m1();
    }
}



/*

Default Exception Format 


In m1                                                                       =================>Thread Name
Exception in thread "main" java.lang.ArithmeticException: / by zero         
------------------->ExceptionName                           --------->Description

        at Demo.m1(Program6.java:10)
        at Demo.main(Program6.java:16)===============================>StackTrace
*/