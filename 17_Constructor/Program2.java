//After compilation bytecode

class Demo2{
    Demo2(){
        System.out.println("In Demo2");
    }
    int x=10;

    public static void main(String [] args){

        System.out.println("In Main");
       
    }
}

/**
 Output:

 Demo2();           //constructor
 invokespecial      //super()....>super() call the Object
 In Demo2           //ldc

 int x              //bipush
 return             //return from Object

public static void main(java.lang.String[]);
In Main         //ldc
return          //return from main()
 */