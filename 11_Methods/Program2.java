class Demo2{
    int x=10;
    static int y=20;
    void fun(){
        System.out.println("In fun Method");
    }

    static void gun(){
        System.out.println("In gun Method");
    }

    public static void main(String args[]){
        Demo2 obj=new Demo2();
        obj.fun();// If we want to call Non-static method from main() method then we want to create object/instance of a class
        gun();
        //obj.gun();//Static & Non-static methods call from main() by using object of a class
    }
}