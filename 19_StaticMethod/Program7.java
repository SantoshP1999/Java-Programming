//Method Signature

class Program7{
    int x=10;
    Program7(){
        System.out.println("In - Constructor");
        System.out.println("x="+x);
    }

        Program7(){
            System.out.println("In - Constructor");
            System.out.println("x="+x);
        }
 
    
}

/*
Output:

Program7.java:10: error: constructor Program7() is already defined in class Program7
        Program7(){
        ^
*/