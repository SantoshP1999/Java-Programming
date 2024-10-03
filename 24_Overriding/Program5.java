//Private modifiere

class Parent{
    private void fun(){             // private method does not access outside the class
        System.out.println("Parent fun");
    }
}

class Child extends Parent{
    void fun(){
        System.out.println("Child fun");
    }
}

class Client{
    public static void main(String[]args){
        Parent p=new Child();
        p.fun();
    }
}


//error: fun() has private access in Parent