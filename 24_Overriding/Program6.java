//final modifiere

class Parent{
    final void fun(){               //Overriden method  is final
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

//error: fun() in Child cannot override fun() in Parent