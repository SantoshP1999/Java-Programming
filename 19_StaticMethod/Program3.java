class Program3{
    int x=10;
    static int y=20;

    void fun1(){
        System.out.println(x);
        System.out.println(y);

    }

    static void fun2(){
        System.out.println(y);

    }
}

class Program3Main{
    public static void main(String[]args){

        Program3 obj1=new Program3();

        obj1.fun1();
        obj1.fun2();

        System.out.println(obj1.x);
        System.out.println(obj1.y);

    } 
}

/**
 Output:

    10
    20
    20
    10
    20
 */