abstract class Parent{
    void career(){
        System.out.println("Engineer");
    }

    abstract void marry();
}

class Child extends Parent{
    void marry(){
        System.out.println("Deepika");
    }
} 

class Client {
    public static void main(String[]args){
        Child obj=new Child();
        obj.career();
        obj.marry();
    }
}

//We can not create object of abstract class but we can use reference of abstract class