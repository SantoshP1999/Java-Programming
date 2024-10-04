//  1)...Normal Inner Class

class Outer{                            //Outer.class
    class Inner{                        //'Outer$Inner.class'
        void m1(){
            System.out.println("In m1-Inner");
        }
    }

    void m2(){
        System.out.println("In m2-Outer");
    }
}

class Client{                           //Client.class
    public static void main(String[]args){
        Outer obj=new Outer();
        obj.m2();

       // Outer.Inner obj1=new Outer().new Inner();
    

        Outer.Inner obj1=obj.new Inner();
        obj1.m1();
    }
}