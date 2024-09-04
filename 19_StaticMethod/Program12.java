class Player{
    Player(int jerNo,String name){
        this.jerNo=jerNo;
        this.name=name;
        System.out.println("In Constructor");
    }

    void info(){
        //System.out.println(jerNo+"="+name);
        System.out.println(jerNo);
        System.out.println(name);

    }
}

class Client{
    public static void main(String[]args){
        Player obj1=new Player(18,"Kohli");
        obj1.info();

        Player obj2=new Player(7,"Dhoni");
        obj2.info();

        Player obj3=new Player(45,"Rohit");
        obj3.info();
    
    }

    
}