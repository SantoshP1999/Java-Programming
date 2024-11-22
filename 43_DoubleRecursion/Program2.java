class DoubleRecursion{
    void fun(int num){
        if(num<=1){
            return;
        }
        fun(num-2);
        System.out.println(num);
        fun(num-1);
    }

    public static void main(String[]args){
        DoubleRecursion obj=new DoubleRecursion();
        obj.fun(5);
    }
}