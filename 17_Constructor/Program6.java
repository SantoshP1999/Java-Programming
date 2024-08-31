class Demo6{
    int x=10;
    String str="Santosh";
    void fun(){
        String str2="Santosh";
        String str3=new String("Core2Web");
    }

    public static void main(String[]args){
        Demo6 obj=new Demo6();

        obj.fun();
    }
}

/**
 Output-

    Demo6();
    invokespecial             //super()
    int x                     //bipush
    String str                 //ldc
    return()


    
    fun()
    String str2                 //ldc
    Str3                        //ldc

    return()

    main()
    obj()

    obj.fun()

    return


 */