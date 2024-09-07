class Parent{
    int x=10;
    static int y=20;
    Parent(){
        System.out.println("In Parent");
    }
}

class Child extends Parent{
    int x=100;
    static int y=200;
    Child(){
        System.out.println("In Child");
    }

    void access(){
        System.out.println(super.x);
        System.out.println(super.y);
        System.out.println(x);
        System.out.println(y);

    }
}

class Client{
    public static void main(String[]args){
        Child obj=new Child();
        obj.access();
    }
}

Output:
/*

    In Parent
    In Child
    10
    20
    100
    200

*/