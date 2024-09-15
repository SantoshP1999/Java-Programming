abstract class Parent{              //abstract class
    void career(){                  //complete/concrete method
        System.out.println("Doctor");
    }
    abstract void marry();          //abstract method
}

class Client{
    public static void main(String[]args){
        Parent obj=new Parent();            //We can not create object of abstract class 
    }
}

//error: Parent is abstract; cannot be instantiated