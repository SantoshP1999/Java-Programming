class Outer{                                                        //Outer.class
    void m1(){
        System.out.println("In m1-Outer");

        class Inner{                                                //'Outer$1Inner.class'
            void m1(){
                System.out.println("In m1-Inner");
            }
        }

        Inner obj=new Inner();
        obj.m1();
    }

    void m2(){
        System.out.println("In m2-Outer");
    }
}

class Client{                                                       //Client.class
    public static void main(String[]args){
        Outer obj=new Outer();
        obj.m1();
        obj.m2();
    }
}