class Outer{
    int x=10;
    static int y=20;

    class Inner{
        void fun2(){
            System.out.println("In fun2-Inner");
            System.out.println(x);
            System.out.println(y);
            fun1();

        }
    }

    void fun1(){
        System.out.println("In fun1-Outer");
    }
}

class Client{
    public static void main(String[]args){

        Outer obj=new Outer();

        Outer.Inner obj1= obj.new Inner();
        obj1.fun2();
    }
}

/*

    this of Outer class means object of Outer class & this$0 is Same
    Outer.this means adress of Outer class

    if Outer class & Inner class are is in each other but they are separate classes 

*/