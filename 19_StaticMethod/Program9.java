// Hidden this  reference

class Program9{
    int x=10;
    Program9(){
        System.out.println("In No-Argumment Constructor");
    }

        Program9(Program9 this,int x){
        System.out.println("In Parameterized Constructor");
    }
    public static void main(String[]args){
        Program9 obj1=new Program9();       //Program9(obj1)
        Program9 obj2=new Program9(10);     //Program9(obj2,10)

    }
}

/*
Output:

error: receiver parameter not applicable for constructor of top-level class
        
        this keyword does not allowed recursive call

    /*

