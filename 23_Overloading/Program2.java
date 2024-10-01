class Parent{
    Parent(){
        System.out.println("In Parent Constructor");
    }

    void Property(){
        System.out.println("Home,Car,Gold");
    }

    void marry(){
        System.out.println("Kriti Sanon");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("In Child Constructor");
    }

    void marry(){
        System.out.println("Aliya Bhat");
    }
}

class Client{
    public static void main(String[]args){
        Child obj=new Child();
        obj.Property();
        obj.marry();
    }
}