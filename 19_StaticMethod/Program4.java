/*
    Static Context*/

class Program4{
    int x=10;
    Program4(){
        System.out.println("In Constructor");
    }
    void fun(){
        System.out.println(x);
    }

    public static void main(String[]args){
        Program4 obj =new Program4();
        obj.fun();
    }
}