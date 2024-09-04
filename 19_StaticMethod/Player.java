class Player{
    // int jerNo;
    // String name;

    Player(int jerNo,String name){              //Player(Player this)
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
        Player obj1=new Player(18,"kohli");     //Player(obj1,18,"Kohli")
        obj1.info();                            //info(obj1)

        Player obj2=new Player(7,"Dhoni");         //Player(obj2,7,"Dhoni")
        obj2.info();                                //info(obj2)

        Player obj3=new Player(45,"Rohit");         //Player(obj3,45,"Rohit")
        obj3.info();                                 //info(obj3)
    
    }

    
}