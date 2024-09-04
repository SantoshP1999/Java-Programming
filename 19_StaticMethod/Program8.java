// Hidden this  reference

class Program8{
    int x=10;
    Program8(){
        System.out.println("In No-Argumment Constructor");
    }

        Program8(int x){
        System.out.println("In Parameterized Constructor");
    }
    public static void main(String[]args){
        Program8 obj1=new Program8();
        Program8 obj2=new Program8(10);

    }
}

