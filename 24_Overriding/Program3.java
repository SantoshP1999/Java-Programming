//Overriding in co-varient return type

class Parent{
    Object fun(){
        System.out.println("Parent fun");
        return Obj;
    }
}

class Child extends Parent{
    String fun(){
        System.out.println("Child fun");
        return "Santosh";
    }
}

class Client{
    public static void main(String[]args){
        Parent p=new Child();
        p.fun();
    }
}