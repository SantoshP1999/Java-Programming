interface Demo{
    void gun();
    void fun();
}

class DemoChild implements Demo{
    public void gun(){                      //make method public in child class
        System.out.println("In gun");
    }

    public void fun(){                      //make method public in child class
        System.out.println("In fun");
    }
}

class Client{
    public static void main(String[]args){
        Demo obj=new DemoChild();
        obj.gun();
        obj.fun();
    }
}