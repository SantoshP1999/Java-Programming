// Normal Inner Class

class Outer{
    class Inner{
        void fun2(){
            System.out.println("In fun2-Inner");
        }
    }

    void fun1(){
        System.out.println("In fun1-Outer");
    }
}

class Client{
    public static void main(String[]args){
                                                        // Internal calls
        Outer obj=new Outer();                          //Outer(obj)
       // obj.fun1();

        Outer.Inner obj1=obj.new Inner();
        obj1.fun2();                                    //Outer$Inner(obj1,obj)

        Outer.Inner obj2=obj.new Inner();
        obj2.fun2();                                   //Outer$Inner(obj2,obj)
    }
}