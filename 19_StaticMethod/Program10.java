class Program10{
    int x=10;
    Program10(){
        System.out.println("In No-arguments Constructor");

    }

    Program10(int x){
        this();
        System.out.println("In Parameterized Constructor");
    }

    public static void main(String[]args){
        Program10 obj=new Program10(50);
    }
}