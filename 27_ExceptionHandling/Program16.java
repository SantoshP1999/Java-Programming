//finally block

class Demo{
    void m1(){

    }
    void m2(){

    }

    public static void main(String[]args){
        System.out.println("start Main");
        Demo obj=new Demo();
        obj.m1();
        obj=null;
        try{
            obj.m2();
        }catch(NullPointerException np){
            System.out.println("Here");
        }
        finally{
            System.out.println("Connection closed");
        }

        System.out.println("End Main");
    }
}

/*
    start Main
    Here
    Connection closed
    End Main
*/