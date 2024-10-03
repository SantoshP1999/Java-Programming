class Parent{
    char fun(){
        System.out.println("Parent fun");
        return 'A';
    }
}

class Child extends Parent{
    int fun(){
        System.out.println("Child fun");
        return 10;
    }
}

class Client{
    public static void main(String[]args){
        Parent p=new Child();
        p.fun();
    }
}

/*
Error===>  In Overrriding method signature & return type will be Same

*/