//   3)......Static Inner Class  (Static Nested Class)

// 

class Outer{
    void m1(){
        System.out.println("In m1-Outer");
    }

    static class Inner{             //Static Inner Class
        void m1(){
            System.out.println("In m1-Inner");
        }
    }

    public static void main(String[]args){
        Inner obj=new Inner();
        obj.m1();
    }
}