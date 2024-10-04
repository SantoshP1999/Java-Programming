// // Method local Inner class  (Outer$Inner.class)

//  2)..... Method Local Inner Class are located in the method()

// Method local inner class come in picture after calling the anyone method()  

class Outer{
    void m1(){
        System.out.println("In m1-Outer");

        // Method local Inner Class
        class Inner{
            void m1(){
                System.out.println("In m1-Inner");
            }
        }

        Inner obj=new Inner();      //object of method local inner class ......>
        obj.m1();                   // Object of method local Inner class must be created in method 
    }

    void m2(){
        System.out.println("In m2-Outer");
    }

    public static void main(String[]args){
        Outer obj=new Outer();
        obj.m1();
        obj.m2();
    }
}

/*
Output:
    In m1-Outer
    In m1-Inner
    In m2-Outer

*/