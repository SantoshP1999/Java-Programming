class Parent{
    Parent(){
        System.out.println("In Parent Constructor");
    }
    void parentProperty(){
        System.out.println("Flat,Car,Gold");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("InChild Constructor");
    }
}

class Client {
    public static void main(String []args){
        Child obj=new Child();
        obj.parentProperty();
    }
}

/*
Output:
In Parent Constructor
InChild Constructor
Flat,Car,Gold
*/