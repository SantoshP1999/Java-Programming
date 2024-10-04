//  Normal Inner Class 

class Outer{
    class Inner{
        void fun2(){
            System.out.println("In fun2-Inner");
        }
    }

    void fun1(){
        System.out.println("In fun1-Inner");
    }
}

class Client{
    public static void main(String[]args){

        Outer obj=new Outer();
        obj.fun1();

        Outer.Inner obj1= new Outer().new Inner();
       // Outer.Inner obj1=obj.new Inner();
        obj1.fun2();
    }
}

/*

    In Constructor of Inner class 2 this are present

    1).hidden this
    2).this of Outer class

*/