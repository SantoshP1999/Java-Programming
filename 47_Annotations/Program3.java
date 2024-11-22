//===========2)......@Deprecated ================

class Parent{
    @Deprecated
    void m1(){
        System.out.println("Paren m1");
    }
}

class Client{
    public static void main(String[]args){
        Parent p=new Parent();
        p.m1();
    }
}