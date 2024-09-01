class Program4{
    int x=10;
    private int y=20;
    static int z=30;

    void disp(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}

class Program4Main{
    public static void main(String[]args){
        Program4 obj1=new Program4();
        Program4 obj2=new Program4();

        obj1.disp();
        obj2.disp();
    }
}