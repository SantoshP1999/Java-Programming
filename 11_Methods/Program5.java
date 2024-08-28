class Demo5{
    void fun(float x){               // if we take int instead of float then incompatible type error shows
        System.out.println("In fun");
        System.out.println(x);
    }

    public static void main(String args[]){
        Demo5 obj=new Demo5();

        obj.fun(10);
        obj.fun(10.5f);
        obj.fun('A');
        
    }
}