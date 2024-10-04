//  1)....Normal Inner Class

class Outer{                        //Outer.class
    class Inner{                    //Outer$Inner.class
        void m1(){
            System.out.println("In m1-Inner");
        }
    }

    void m2(){
        System.out.println("In m2-Outer");
    }

    public static void main(String[]args){
        Inner obj=new Outer().new Inner();      //main() method is in same class then not need to write Outer.Inner
        obj.m1();

    }
}