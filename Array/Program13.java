//Passing Array as an Arguments
class ArrayDemo13{

    static void fun(int x,float y,int ch){
        System.out.println(x);  //10
        System.out.println(y);  //20.5
        System.out.println(ch); //65
    }
    public static void main(String []args){
        fun(10,20.5f,'A');
    }
}