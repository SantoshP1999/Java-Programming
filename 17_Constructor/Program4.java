//Constructor Demo

class Demo4{
    Demo4(){
        System.out.println("In Constructor");
    }
    void fun(){
        Demo4 obj=new Demo4();
    }

    public static void main(String[]args){
        Demo4 obj1=new Demo4();
        Demo4 obj2=new Demo4();

        obj1.fun();
    }

}