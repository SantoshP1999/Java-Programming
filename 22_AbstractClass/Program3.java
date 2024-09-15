
// Singletone Design Pattern


class Singletone{
    static Singletone obj=new Singletone();
    private Singletone(){
        System.out.println("Constructor");
    }
    static Singletone getObject(){
        return obj;
    }
}

class Client{
    public static void main (String[]args){
        Singletone obj1=Singletone.getObject();
        System.out.println(obj1);

        Singletone obj2=Singletone.getObject();
        System.out.println(obj2);


        Singletone obj3=Singletone.getObject();
        System.out.println(obj3);


    }
}

/*

Output:

    Constructor
    Singletone@251a69d7
    Singletone@251a69d7
    Singletone@251a69d7

*/