/*After Compilation bytecode of given program
How constructor are created 
*/
class Demo1{
    int age=10;
    int jerNo=7;
    void fun(){
        int x=10;
    }
}

/**
 Output:
    Demo1();            //default constructor created by compiler
    invokespecial()     //Constructors super()method .......>super()method /invokespecial call the Object class 

    int age;            //bipush   10
    int jerNo;          //bipush    7

    return()            //return from Object class

    void fun();           //call the fun()

    int x;                 //bipush   10

    return                 //return from fun()method
 */