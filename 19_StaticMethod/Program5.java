//  Hidden this reference

class Program5{
    int x=10;
    Program5(){                             //Program5(Program5.this)
        System.out.println("In Constructor");
        System.out.println(this);
        System.out.println(this.x);

    }

    void fun(){
        System.out.println(this);           //fun(Program5 this)
        System.out.println(this.x);

    }

    public static void main(String[]args){
        Program5 obj=new Program5();        //Prgram5(obj)
        System.out.println(obj);
        obj.fun();                          //fun(obj)
    }
}

/*
Output:

    In Constructor
    Program5@7ad041f3
    10
    Program5@7ad041f3
    Program5@7ad041f3
    10
*/