class Program2{
    static int x=10;
    static int y=20;

    static void disp(){
        System.out.println(x);
        System.out.println(y);

    }
}

class Program2Main{
    public static void main(String[]args){
        System.out.println(Program2.x);
        System.out.println(Program2.y);

        Program2.disp();
    } 
}