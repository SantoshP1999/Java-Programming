class Demo{
    void fun(int x){
        System.out.println(x);
    }

    void fun(float y){
        System.out.println(y);
    }

    void fun(Demo obj){
        System.out.println("In Demo Para");
        System.out.println(obj);

    }
    public static void main(String[]args){
        Demo obj=new Demo();
        obj.fun(10);
        obj.fun(30.5f);
        Demo obj1=new Demo();
        obj1.fun(obj);

    }
}

output:
/*

    10
    30.5
    In Demo Para
    Demo@7ad041f3

*/