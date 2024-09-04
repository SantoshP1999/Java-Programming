class Program11{
    int x=10;
    Program11(){
        this(70);
        System.out.println("In No-argument Constructor");
    }
        Program11(int x){
        this();
        System.out.println("In Parameterized Constructor");
    }

    public static void main(String[]args){
        Program11 obj=new Program11();
    }

}

// error: recursive constructor invocation